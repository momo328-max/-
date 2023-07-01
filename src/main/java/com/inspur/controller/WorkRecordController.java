package com.inspur.controller;

import com.github.pagehelper.PageInfo;
import com.inspur.pojo.Department;
import com.inspur.pojo.RestRecord;
import com.inspur.pojo.User;
import com.inspur.pojo.WorkRecord;
import com.inspur.service.WorkRecordService;
import com.inspur.service.UserService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class WorkRecordController {

    @Autowired
    private WorkRecordService workRecordService;
    @Autowired
    private UserService userService;

    @RequestMapping("/workmanager/workSearch")
    public String workSearch(Integer pageNum,String startTime,String endTime,String state,Model model){
        if(pageNum==null){
            pageNum=1;
        }
        WorkRecord workRecord = new WorkRecord();
        workRecord.setStartTime(startTime);
        workRecord.setEndTime(endTime);
        workRecord.setState(state);
        List<WorkRecord> workRecords = workRecordService.selectAll(workRecord);
        model.addAttribute("workRecordList", workRecords);
        return "pages/workmanager/workSearch";
    }

    @RequestMapping("/worksyouninn/worksyouninnSearch")
    public String worksyouninnSearch(Integer pageNum,String startTime,String endTime,String account,String state,Model model){
        if(pageNum==null){
            pageNum=1;
        }
        WorkRecord workRecord = new WorkRecord();
        workRecord.setStartTime(startTime);
        workRecord.setEndTime(endTime);
        workRecord.setState(state);
        workRecord.setAccount(account);
        List<WorkRecord> workRecords = workRecordService.selectAll(workRecord);
        model.addAttribute("workRecordList", workRecords);
        return "pages/worksyouninn/worksyouninnSearch";
    }

    @RequestMapping("/workmanager/workInsert")
    public String workInsert(HttpServletRequest request, Model model){
        HttpSession session = request.getSession(true);
        User user = (User)session.getAttribute("user");
        model.addAttribute("user",user);
        return "pages/workmanager/workInsert";
    }

    @RequestMapping("/workmanager/saveWork")
    public String saveWork(String account,String workDate,String startTime,String endTime,String workTime,String state,String notes, Model model){
        WorkRecord workRecord = new WorkRecord();
        workRecord.setWorkDate(workDate);
        workRecord.setAccount(account);
        workRecord.setStartTime(startTime);
        workRecord.setEndTime(endTime);
        workRecord.setWorkTime(workTime);
        workRecord.setState(state);
        workRecord.setNotes(notes);
        workRecordService.insert(workRecord);
        return workSearch(1,"","","",model);
    }
    @RequestMapping("/workmanager/updateWork")
    public String saveWork(Integer recordId,String account,String workDate,String startTime,String endTime,String workTime,String state,String notes,Model model){
        WorkRecord workRecord = new WorkRecord();
        workRecord.setRecordId(recordId);
        workRecord.setWorkDate(workDate);
        workRecord.setAccount(account);
        workRecord.setStartTime(startTime);
        workRecord.setEndTime(endTime);
        workRecord.setState(state);
        workRecord.setWorkTime(workTime);
        workRecord.setNotes(notes);
        workRecordService.update(workRecord);
        return workSearch(1,"","","",model);

    }
    @RequestMapping("/workmanager/workDelete")
    public String userDelete(Integer id,Model model){
        List<Integer> ids= new ArrayList<>();
        ids.add(id);
        workRecordService.deleteRecords(ids);
        return workSearch(1,null,null,"",model);
    }

    @RequestMapping("/workmanager/accepted")
    public String accepted(Integer id,Model model){
        WorkRecord record = workRecordService.findById(id);
        record.setState("已通过");
        workRecordService.update(record);
        return worksyouninnSearch(1,null,null,"","",model);
    }

    @RequestMapping("/workmanager/rejected")
    public String rejected(Integer id,Model model){
        WorkRecord record = workRecordService.findById(id);
        record.setState("已驳回");
        workRecordService.update(record);
        return worksyouninnSearch(1,null,null,"","",model);
    }

    @RequestMapping("/workmanager/workUpdate")
    public String restUpdate(Integer id,Model model){
        WorkRecord record = workRecordService.findById(id);
        model.addAttribute("record",record);
        return "pages/workmanager/workUpdate";
    }
}
