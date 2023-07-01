package com.inspur.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.inspur.pojo.Department;
import com.inspur.pojo.User;
import com.inspur.pojo.WorkRecord;
import com.inspur.service.DepartmentService;
import com.inspur.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class DeptController {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private UserService userService;

    @RequestMapping("/dept/deptSearch")
    public String deptSearch(Integer pageNum,String department_name,Model model){
        if(pageNum==null){
            pageNum=1;
        }
        List<Department> departmentList = departmentService.selectAll(department_name);
        model.addAttribute("departmentList", departmentList);
        return "pages/dept/deptSearch";
    }

    @RequestMapping("/dept/deptInsert")
    public String deptInsert(Model model){
        User user = new User();
        PageInfo<User> users = userService.selectAll(1,user);
        model.addAttribute("users", users.getList());
        return "pages/dept/deptInsert";
    }

    @RequestMapping("/dept/updateDept")
    public String updateDept(Integer departmentId,String departmentName,String manager,Model model){
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        Department department = new Department(departmentId,departmentName,manager,0,sqlDate,departmentId.toString());
        departmentService.update(department);
        return deptSearch(1,null,model);
    }
    @RequestMapping("/dept/saveDept")
    public String addUser(String departmentNum,String departmentName,String manager,Model model){
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        Department department = new Department(-1,departmentName,manager,0,sqlDate,departmentNum);
        departmentService.insert(department);
        return deptSearch(1,null,model);
    }

    @RequestMapping("/dept/deptDelete")
    public String deptDelete(Integer id,Model model){
        List<Integer> ids= new ArrayList<>();
        ids.add(id);
        departmentService.delDepts(ids);
        return deptSearch(1,null,model);
    }

    @RequestMapping("/dept/deptUpdate")
    public String restUpdate(Integer id,Model model){
        User user = new User();
        user.setDepartmentId(id);
        PageInfo<User> userPage = userService.selectAll(1,user);
        Department dept = departmentService.findById(id);
        model.addAttribute("userList",userPage.getList());
        model.addAttribute("department",dept);
        return "pages/dept/deptUpdate";
    }

}
