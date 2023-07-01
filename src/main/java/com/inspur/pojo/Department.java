package com.inspur.pojo;

import java.sql.Date;


public class Department {
    private Integer departmentId;
    private String departmentName;
    private String manager;
    private Integer totalUser;
    private Date createTime;
    private String departmentNum;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Integer getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(Integer totalUser) {
        this.totalUser = totalUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(String departmentNum) {
        this.departmentNum = departmentNum;
    }

    public Department() {
    }

    public Department(Integer departmentId, String departmentName, String manager, Integer totalUser, Date createTime, String departmentNum) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.manager = manager;
        this.totalUser = totalUser;
        this.createTime = createTime;
        this.departmentNum = departmentNum;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", manager='" + manager + '\'' +
                ", totalUser=" + totalUser +
                ", createTime=" + createTime +
                ", departmentNum='" + departmentNum + '\'' +
                '}';
    }
}
