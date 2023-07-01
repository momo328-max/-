package com.inspur.pojo;

import java.io.Serializable;

public class ReportRecord implements Serializable {
    private Long recordId;

    private String account;

    private String reportDate;

    private String workProcess;

    private String workContent;

    private String tomorrowPlan;

    private String problem;

    private String other;

    private static final long serialVersionUID = 1L;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public String getWorkProcess() {
        return workProcess;
    }

    public void setWorkProcess(String workProcess) {
        this.workProcess = workProcess == null ? null : workProcess.trim();
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent == null ? null : workContent.trim();
    }

    public String getTomorrowPlan() {
        return tomorrowPlan;
    }

    public void setTomorrowPlan(String tomorrowPlan) {
        this.tomorrowPlan = tomorrowPlan == null ? null : tomorrowPlan.trim();
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem == null ? null : problem.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
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
        ReportRecord other = (ReportRecord) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getReportDate() == null ? other.getReportDate() == null : this.getReportDate().equals(other.getReportDate()))
            && (this.getWorkProcess() == null ? other.getWorkProcess() == null : this.getWorkProcess().equals(other.getWorkProcess()))
            && (this.getWorkContent() == null ? other.getWorkContent() == null : this.getWorkContent().equals(other.getWorkContent()))
            && (this.getTomorrowPlan() == null ? other.getTomorrowPlan() == null : this.getTomorrowPlan().equals(other.getTomorrowPlan()))
            && (this.getProblem() == null ? other.getProblem() == null : this.getProblem().equals(other.getProblem()))
            && (this.getOther() == null ? other.getOther() == null : this.getOther().equals(other.getOther()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getReportDate() == null) ? 0 : getReportDate().hashCode());
        result = prime * result + ((getWorkProcess() == null) ? 0 : getWorkProcess().hashCode());
        result = prime * result + ((getWorkContent() == null) ? 0 : getWorkContent().hashCode());
        result = prime * result + ((getTomorrowPlan() == null) ? 0 : getTomorrowPlan().hashCode());
        result = prime * result + ((getProblem() == null) ? 0 : getProblem().hashCode());
        result = prime * result + ((getOther() == null) ? 0 : getOther().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordId=").append(recordId);
        sb.append(", account=").append(account);
        sb.append(", reportDate=").append(reportDate);
        sb.append(", workProcess=").append(workProcess);
        sb.append(", workContent=").append(workContent);
        sb.append(", tomorrowPlan=").append(tomorrowPlan);
        sb.append(", problem=").append(problem);
        sb.append(", other=").append(other);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}