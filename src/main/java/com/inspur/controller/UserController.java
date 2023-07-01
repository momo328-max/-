package com.inspur.controller;

import com.github.pagehelper.PageInfo;
import com.inspur.pojo.Department;
import com.inspur.pojo.User;
import com.inspur.service.DepartmentService;
import com.inspur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private DepartmentService departmentService;

    boolean isMemoryPwd;


    @RequestMapping("/login")
    public String login(HttpServletRequest request,HttpServletResponse response, Model model){
        String isMemory = request.getParameter("isMemory");
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        //如果选中 记住密码 调用记住密码的方法。
        if (isMemory != null) {
            //记住密码
            isMemoryPwd =true;
        } else {
            isMemoryPwd =false;
        }
        User user = userService.selectByName(account);

        if (user!=null && user.getPassword().equals(password)) {
            model.addAttribute("user",user);
            HttpSession session = request.getSession(true);
            session.setAttribute("user", user);
            try{
               isMemory(isMemoryPwd ,user,request,response);
            }catch (UnsupportedEncodingException e){
                e.printStackTrace();
            }
            return "pages/main";
        } else {
            model.addAttribute("msg","用户名或密码不对，请重新登录");
            return  "pages/login";
        }

    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = request.getSession(true);
        User user = (User)session.getAttribute("user");
        if(user != null) {
            session.removeAttribute("user");
        }
        return "pages/login";
    }

    private void isMemory(boolean isMemoryPwd, User user, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        if (isMemoryPwd) {
            Cookie account = new Cookie("account",user.getAccount());
            account.setPath("/");
            Cookie password = new Cookie("password", user.getPassword());
            password.setPath("/");
            //设置账户和密码有效期为7天
            account.setMaxAge((60*60*24)*7);
            password.setMaxAge((60*60*24)*7);
            response.addCookie(account);
            response.addCookie(password);
        } else {
            //如果没有记住密码，需要删除cookie
            Cookie[] cookies = request.getCookies();
            if (cookies!=null) {
                for (Cookie cookie :request.getCookies()) {
                    if(cookie.getName().equals("account")||cookie.getName().equals("password")){
                        cookie.setMaxAge(0);;
                        cookie.setPath("/");
                        response.addCookie(cookie);
                    }
                }
            }
        }
    }

    @RequestMapping("/user/userSearch")
    public String userSearch(Integer pageNum,String name,Integer departmentId,Model model){
        if(pageNum==null){
            pageNum=1;
        }
        User user = new User();
        user.setName(name);
        user.setDepartmentId(departmentId);
        PageInfo<User> pageInfo = userService.selectAll(pageNum,user);
        model.addAttribute("userList", pageInfo);
        List<Department> departmentList = departmentService.selectAll(null);
        model.addAttribute("departmentList", departmentList);
        return "pages/user/userSearch";
    }

    @RequestMapping("/user/userPasswordUpdate")
    public String userPasswordUpdate(HttpServletRequest request,HttpServletResponse response,Model model){
        HttpSession session = request.getSession(true);
        User user = (User)session.getAttribute("user");
        if(user != null) {
            model.addAttribute("userInfo", user);
            return "pages/user/userPasswordUpdate";
        } else {
            return "pages/login";
            // 用户未登录
        }
    }

    @RequestMapping("/user/userInsert")
    public String userInsert(Model model){
        List<Department> departmentList = departmentService.selectAll(null);
        model.addAttribute("departmentList", departmentList);
        return "pages/user/userInsert";
    }

    @RequestMapping("/user/addUser")
    public String addUser(String account,String password,String name,Integer departmentId,Integer sex,String mobile,String birthday,String email,Model model){
        Department department =  departmentService.findById(departmentId);
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        User user = new User(-1,account,password,name,departmentId,sex,birthday,mobile,email,1,"",sqlDate,0,department);
        userService.insert(user);
        return userSearch(1,null,null,model);
    }

    @RequestMapping("/user/updateUser")
    public String updateUser(Integer id,String account,String password,String name,Integer departmentId,String createTime,Integer sex,String mobile,String birthday,String email,Model model){
        Department department =  departmentService.findById(departmentId);
        java.sql.Date sqlDate=null;
        try {
            java.util.Date utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(createTime);
            sqlDate = new java.sql.Date(utilDate.getTime());
        }catch (Exception e){
            java.util.Date utilDate = new java.util.Date();
            sqlDate = new java.sql.Date(utilDate.getTime());
        }
        User user = new User(id,account,password,name,departmentId,sex,birthday,mobile,email,1,"",sqlDate,0,department);
        userService.update(user);
        return userSearch(1,null,null,model);
    }

    @RequestMapping("/user/userDelete")
    public String userDelete(Integer id,Model model){
        List<Integer> ids= new ArrayList<>();
        ids.add(id);
        userService.delUser(ids);
        return userSearch(1,null,null,model);
    }

    @RequestMapping("/user/userUpdate")
    public String userUpdate(Integer id,Model model){
        User user = userService.findById(id);
        model.addAttribute("userInfo",user);
        List<Department> departmentList = departmentService.selectAll(null);
        model.addAttribute("departmentList", departmentList);
        return "pages/user/userUpdate";
    }

    @RequestMapping("/left")
    public String left(){
        return "pages/left";
    }
    @RequestMapping("/mydesktop/mydesktop")
    public String mydesktop(){
        return "pages/mydesktop/mydesktop";
    }
    @RequestMapping("/top")
    public String top(){
        return "pages/top";
    }


}
