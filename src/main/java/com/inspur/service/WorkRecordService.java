package com.inspur.service;

import com.inspur.pojo.WorkRecord;

import java.util.List;


public interface WorkRecordService {
    public List<WorkRecord> selectAll(WorkRecord record);
    public void addWorkRecord(WorkRecord workRecord);
    public WorkRecord findById(Integer recordId);
    public void insert(WorkRecord record);
    public void update(WorkRecord record);
    public void deleteRecords(List<Integer> ids);
}
