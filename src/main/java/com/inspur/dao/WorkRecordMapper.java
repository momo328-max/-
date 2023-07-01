package com.inspur.dao;

import com.inspur.pojo.WorkRecord;

import java.util.List;

public interface WorkRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(WorkRecord record);

    int insertSelective(WorkRecord record);

    WorkRecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(WorkRecord record);

    int updateByPrimaryKey(WorkRecord record);

    List<WorkRecord> selectAll(WorkRecord record);
}