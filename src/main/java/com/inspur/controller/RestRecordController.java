package com.inspur.controller;

import com.inspur.pojo.RestRecord;
import com.inspur.pojo.User;
import com.inspur.pojo.WorkRecord;
import com.inspur.service.UserService;
import com.inspur.service.RestRecordService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
public class RestRecordController {

    @Autowired
    private RestRecordService restRecordService;

    @RequestMapping("/restmanager/restSearch")
    public String restSearch(Integer pageNum,String restStartDate,String restEndDate,String state,Model model){
        if(pageNum==null){
            pageNum=1;
        }
        RestRecord restRecord = new RestRecord();
        restRecord.setRestStartDate(restStartDate);
        restRecord.setRestEndDate(restEndDate);
        restRecord.setState(state);
        List<RestRecord> restRecords = restRecordService.selectAll(restRecord);
        model.addAttribute("restRecordList", restRecords);
        return "pages/restmanager/restSearch";
    }

    @RequestMapping("/restsyouninn/restsyouninnSearch")
    public String restsyouninnSearch(Integer pageNum,String restStartDate,String restEndDate,String account,String state,Model model){
        if(pageNum==null){
            pageNum=1;
        }
        RestRecord restRecord = new RestRecord();
        restRecord.setRestStartDate(restStartDate);
        restRecord.setRestEndDate(restEndDate);
        restRecord.setState(state);
        restRecord.setAccount(account);
        List<RestRecord> restRecords = restRecordService.selectAll(restRecord);
        model.addAttribute("restRecordList", restRecords);
        return "pages/restsyouninn/restsyouninnSearch";
    }

    @RequestMapping("/restmanager/restInsert")
    public String restInsert(HttpServletRequest request, Model model){
        HttpSession session = request.getSession(true);
        User user = (User)session.getAttribute("user");
        model.addAttribute("user",user);
        return "pages/restmanager/restInsert";
    }

    @RequestMapping("/restmanager/saveRest")
    public String saveRest(String account,String restStartDate,String startTime,String restEndDate,String endTime,String restTime,Model model){
        RestRecord restRecord = new RestRecord();
        restRecord.setRestStartDate(restStartDate);
        restRecord.setAccount(account);
        restRecord.setStartTime(startTime);
        restRecord.setEndTime(endTime);
        restRecord.setRestEndDate(restEndDate);
        restRecord.setRestTime(restTime);
        restRecord.setState("审批中");
        restRecordService.insert(restRecord);
        return restSearch(1,"","","",model);
    }



    @RequestMapping("/restmanager/updateRest")
    public String saveWork(Long restId,String account,String restStartDate,String startTime,String restEndDate,String endTime,String restTime,Model model){
        RestRecord restRecord = new RestRecord();
        restRecord.setRestId(restId);
        restRecord.setRestStartDate(restStartDate);
        restRecord.setAccount(account);
        restRecord.setStartTime(startTime);
        restRecord.setEndTime(endTime);
        restRecord.setRestEndDate(restEndDate);
        restRecord.setRestTime(restTime);
        restRecordService.update(restRecord);
        return restSearch(1,"","","",model);
    }
    @RequestMapping("/restmanager/restDelete")
    public String userDelete(Long id,Model model){
        List<Long> ids= new ArrayList<>();
        ids.add(id);
        restRecordService.deleteRecords(ids);
        return restSearch(1,null,null,"",model);
    }

    @RequestMapping("/restmanager/accepted")
    public String accepted(Long id,Model model){
        RestRecord record = restRecordService.findById(id);
        record.setState("已通过");
        restRecordService.update(record);
        return restsyouninnSearch(1,null,null,"","",model);
    }

    @RequestMapping("/restmanager/rejected")
    public String rejected(Long id,Model model){
        RestRecord record = restRecordService.findById(id);
        record.setState("已驳回");
        restRecordService.update(record);
        return restsyouninnSearch(1,null,null,"","",model);
    }

    @RequestMapping("/restmanager/restUpdate")
    public String restUpdate(Long id,Model model){
        RestRecord record = restRecordService.findById(id);
        model.addAttribute("record",record);
        return "pages/restmanager/restUpdate";
    }
}
