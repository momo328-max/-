package com.inspur.service.impl;

import com.inspur.dao.WorkRecordMapper;
import com.inspur.pojo.WorkRecord;
import com.inspur.service.WorkRecordService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkRecordServiceImpl implements WorkRecordService {

    @Autowired
    private WorkRecordMapper workRecordDao;

    @Override
    public List<WorkRecord> selectAll(WorkRecord record) {
        return workRecordDao.selectAll(record);

    }


    @Override
    public void addWorkRecord(WorkRecord workRecord) {
        workRecordDao.insert(workRecord);
    }

    @Override
    public WorkRecord findById(Integer recordId) {
        return workRecordDao.selectByPrimaryKey(recordId);
    }

    @Override
    public void insert(WorkRecord record){
        workRecordDao.insert(record);
    }
    @Override
    public void update(WorkRecord record){
        workRecordDao.updateByPrimaryKey(record);
    }

    public void deleteRecords(List<Integer> ids){
        for (Integer id:ids
        ) {
            workRecordDao.deleteByPrimaryKey(id);
        }
    }
}
