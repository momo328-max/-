package com.inspur.service;

import com.inspur.pojo.ReportRecord;
import com.inspur.pojo.ReportRecordCondition;

import java.util.List;


public interface ReportRecordService {
    public List<ReportRecord> selectAll(ReportRecordCondition condition);
    public void addReportRecord(ReportRecord reportRecord);
    public ReportRecord findById(Long recordId);
    public void insert(ReportRecord record);
    public void update(ReportRecord record);
    public void deleteRecords(List<Long> ids);
}
