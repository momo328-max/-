package com.inspur.dao;

import com.inspur.pojo.RestRecord;

import java.util.List;

public interface RestRecordMapper {
    int deleteByPrimaryKey(Long restId);

    int insert(RestRecord record);

    int insertSelective(RestRecord record);

    RestRecord selectByPrimaryKey(Long restId);

    int updateByPrimaryKeySelective(RestRecord record);

    int updateByPrimaryKey(RestRecord record);
    List<RestRecord> selectAll(RestRecord record);
}