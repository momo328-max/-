package com.inspur.pojo;

import com.mysql.cj.util.StringUtils;

import java.io.Serializable;

public class RestRecord implements Serializable {
    private Long restId;

    private String account;

    private String restStartDate;

    private String startTime;

    private String restEndDate;

    private String endTime;

    private String restTime;

    private String restCourse;

    private String notes;

    private String state;

    private static final long serialVersionUID = 1L;

    public Long getRestId() {
        return restId;
    }

    public void setRestId(Long restId) {
        this.restId = restId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getRestStartDate() {
        return restStartDate;
    }

    public void setRestStartDate(String restStartDate) {
        this.restStartDate = restStartDate == null ? null : restStartDate.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getRestEndDate() {
        return restEndDate;
    }

    public void setRestEndDate(String restEndDate) {
        this.restEndDate = restEndDate == null ? null : restEndDate.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getRestTime() {
        return restTime;
    }

    public void setRestTime(String restTime) {
        this.restTime = restTime == null ? null : restTime.trim();
    }

    public String getRestCourse() {
        return restCourse;
    }

    public void setRestCourse(String restCourse) {
        this.restCourse = restCourse == null ? null : restCourse.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RestRecord other = (RestRecord) that;
        return (this.getRestId() == null ? other.getRestId() == null : this.getRestId().equals(other.getRestId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getRestStartDate() == null ? other.getRestStartDate() == null : this.getRestStartDate().equals(other.getRestStartDate()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getRestEndDate() == null ? other.getRestEndDate() == null : this.getRestEndDate().equals(other.getRestEndDate()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getRestTime() == null ? other.getRestTime() == null : this.getRestTime().equals(other.getRestTime()))
            && (this.getRestCourse() == null ? other.getRestCourse() == null : this.getRestCourse().equals(other.getRestCourse()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRestId() == null) ? 0 : getRestId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getRestStartDate() == null) ? 0 : getRestStartDate().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getRestEndDate() == null) ? 0 : getRestEndDate().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getRestTime() == null) ? 0 : getRestTime().hashCode());
        result = prime * result + ((getRestCourse() == null) ? 0 : getRestCourse().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", restId=").append(restId);
        sb.append(", account=").append(account);
        sb.append(", restStartDate=").append(restStartDate);
        sb.append(", startTime=").append(startTime);
        sb.append(", restEndDate=").append(restEndDate);
        sb.append(", endTime=").append(endTime);
        sb.append(", restTime=").append(restTime);
        sb.append(", restCourse=").append(restCourse);
        sb.append(", notes=").append(notes);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}