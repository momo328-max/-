package com.inspur.service.impl;

import com.inspur.dao.ReportRecordMapper;
import com.inspur.pojo.ReportRecord;
import com.inspur.pojo.ReportRecordCondition;
import com.inspur.service.ReportRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportRecordServiceImpl implements ReportRecordService {

    @Autowired
    private ReportRecordMapper reportRecordDao;

    @Override
    public List<ReportRecord> selectAll(ReportRecordCondition condition) {
        return reportRecordDao.selectAll(condition);

    }


    @Override
    public void addReportRecord(ReportRecord reportRecord) {
        reportRecordDao.insert(reportRecord);
    }

    @Override
    public ReportRecord findById(Long recordId) {
        return reportRecordDao.selectByPrimaryKey(recordId);
    }

    @Override
    public void insert(ReportRecord record){
        reportRecordDao.insert(record);
    }

    @Override
    public void update(ReportRecord record){
        reportRecordDao.updateByPrimaryKey(record);
    }

    public void deleteRecords(List<Long> ids){
        for (Long id:ids
        ) {
            reportRecordDao.deleteByPrimaryKey(id);
        }
    }
}
