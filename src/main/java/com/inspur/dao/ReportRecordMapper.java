package com.inspur.dao;

import com.inspur.pojo.ReportRecord;
import com.inspur.pojo.ReportRecordCondition;
import com.inspur.pojo.RestRecord;

import java.util.List;

public interface ReportRecordMapper {
    int deleteByPrimaryKey(Long recordId);

    int insert(ReportRecord record);

    int insertSelective(ReportRecord record);

    ReportRecord selectByPrimaryKey(Long recordId);

    int updateByPrimaryKeySelective(ReportRecord record);

    int updateByPrimaryKey(ReportRecord record);
    List<ReportRecord> selectAll(ReportRecordCondition condition);
}