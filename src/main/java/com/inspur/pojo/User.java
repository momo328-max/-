package com.inspur.pojo;

import java.sql.Date;


public class User {
    private Integer id;
    private String account;
    private String password;
    private String name;
    private Integer departmentId;
    private Integer sex;
    private String birthday;
    private String mobile;
    private String email;
    private Integer userType;
    private String mylevel;
    private Date createTime;
    private Integer state;
    private Department department;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getMylevel() {
        return mylevel;
    }

    public void setMylevel(String mylevel) {
        this.mylevel = mylevel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public User() {
    }

    public User(Integer id, String account, String password, String name, Integer departmentId, Integer sex, String birthday, String mobile, String email, Integer userType, String mylevel, Date createTime, Integer state, Department department) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.departmentId = departmentId;
        this.sex = sex;
        this.birthday = birthday;
        this.mobile = mobile;
        this.email = email;
        this.userType = userType;
        this.mylevel = mylevel;
        this.createTime = createTime;
        this.state = state;
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", sex=" + sex +
                ", birthday='" + birthday + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", userType=" + userType +
                ", mylevel='" + mylevel + '\'' +
                ", createTime=" + createTime +
                ", state=" + state +
                ", department=" + department +
                '}';
    }
}
