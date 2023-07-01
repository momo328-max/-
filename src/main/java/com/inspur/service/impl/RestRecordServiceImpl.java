package com.inspur.service.impl;

import com.inspur.dao.RestRecordMapper;
import com.inspur.pojo.RestRecord;
import com.inspur.service.RestRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestRecordServiceImpl implements RestRecordService {

    @Autowired
    private RestRecordMapper restRecordDao;

    @Override
    public List<RestRecord> selectAll(RestRecord record) {
        return restRecordDao.selectAll(record);

    }


    @Override
    public void addRestRecord(RestRecord restRecord) {
        restRecordDao.insert(restRecord);
    }

    @Override
    public RestRecord findById(Long recordId) {
        return restRecordDao.selectByPrimaryKey(recordId);
    }

    @Override
    public void insert(RestRecord record){
        restRecordDao.insert(record);
    }

    @Override
    public void update(RestRecord record){
        restRecordDao.updateByPrimaryKey(record);
    }

    public void deleteRecords(List<Long> ids){
        for (Long id:ids
        ) {
            restRecordDao.deleteByPrimaryKey(id);
        }
    }
}
