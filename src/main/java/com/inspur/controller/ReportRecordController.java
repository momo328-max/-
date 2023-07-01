package com.inspur.controller;

import com.inspur.pojo.ReportRecord;
import com.inspur.pojo.ReportRecordCondition;
import com.inspur.service.ReportRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class ReportRecordController {

    @Autowired
    private ReportRecordService reportRecordService;

    @RequestMapping("/report/reportSearch")
    public String reportSearch(Integer pageNum,String account,String startDate,String endDate,Model model){
        if(pageNum==null){
            pageNum=1;
        }
        ReportRecordCondition condition = new ReportRecordCondition();
        condition.setAccount(account);
        condition.setStartDate(startDate);
        condition.setEndDate(endDate);
        List<ReportRecord> reportRecords = reportRecordService.selectAll(condition);
        model.addAttribute("reportRecordList", reportRecords);
        return "pages/report/reportSearch";
    }

    @RequestMapping("/report/reportInsert")
    public String reportInsert(Model model){
        return "pages/report/reportInsert";
    }

    @RequestMapping("/report/saveReport")
    public String saveReport(String account,String reportDate,String workProcess,String workContent,String tomorrowPlan,String problem,String other,Model model){
        ReportRecord reportRecord = new ReportRecord();
        reportRecord.setAccount(account);
        reportRecord.setReportDate(reportDate);
        reportRecord.setWorkProcess(workProcess);
        reportRecord.setWorkContent(workContent);
        reportRecord.setTomorrowPlan(tomorrowPlan);
        reportRecord.setProblem(problem);
        reportRecord.setOther(other);
        reportRecordService.insert(reportRecord);
        return reportSearch(1,"","",null,model);
    }
//
@RequestMapping("/report/updateReport")
public String updateReport(Long reportId,String account,String reportDate,String workProcess,String workContent,String tomorrowPlan,String problem,String other,Model model){
    ReportRecord reportRecord = new ReportRecord();
    reportRecord.setRecordId(reportId);
    reportRecord.setAccount(account);
    reportRecord.setReportDate(reportDate);
    reportRecord.setWorkProcess(workProcess);
    reportRecord.setWorkContent(workContent);
    reportRecord.setTomorrowPlan(tomorrowPlan);
    reportRecord.setProblem(problem);
    reportRecord.setOther(other);
    reportRecordService.update(reportRecord);
    return reportSearch(1,"","",null,model);
}
    @RequestMapping("/report/reportDelete")
    public String reportDelete(Long id,Model model){
        List<Long> ids= new ArrayList<>();
        ids.add(id);
        reportRecordService.deleteRecords(ids);
        return reportSearch(1,null,null,null,model);
    }

    @RequestMapping("/report/reportUpdate")
    public String reportUpdate(Long id,Model model){
        ReportRecord record = reportRecordService.findById(id);
        model.addAttribute("record",record);
        return "pages/report/reportUpdate";
    }
}
