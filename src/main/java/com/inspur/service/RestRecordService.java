package com.inspur.service;

import com.inspur.pojo.RestRecord;

import java.util.List;


public interface RestRecordService {
    public List<RestRecord> selectAll(RestRecord record);
    public void addRestRecord(RestRecord restRecord);
    public RestRecord findById(Long recordId);
    public void insert(RestRecord record);
    public void update(RestRecord record);
    public void deleteRecords(List<Long> ids);
}
