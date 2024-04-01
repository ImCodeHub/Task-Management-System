package com.TaskManagement.Task.Management.System.Model;

import java.sql.Timestamp;

public class ManagerTaskInfo {
    private String taskName;
    private String description;
    private Timestamp startDate;
    private Timestamp endDate;
    private String status;


    /**
     * @return String return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Timestamp return the startDate
     */
    public Timestamp getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    /**
     * @return Timestamp return the endDate
     */
    public Timestamp getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
