package com.inspur.pojo;

import com.mysql.cj.util.StringUtils;

import java.io.Serializable;

public class ReportRecordCondition{
    private String account;

    private String startDate;

    private String endDate;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}