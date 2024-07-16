package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="task")
public class taskentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="task_id")
    private Integer taskid;
    @Column(name="task_name")
    private String taskName;
    @Column(name="task_category")
    private String taskCategory;
    @Column(name="task_check")
    private boolean taskCheck;
    @Column(name="due_date")
    private Date duedate;

    @JoinColumn(name="user_id")
    private Integer userId;

    @Column(name="is_deleted")
    private boolean isdeleted;

   /*@ManyToOne
    @JoinColumn(name="user_id")
    private Integer userId;*/


   public taskentity(){}

    public taskentity(String taskName, String taskCategory, boolean taskCheck, Date duedate, Integer userId, boolean isdeleted) {
        this.taskName = taskName;
        this.taskCategory = taskCategory;
        this.taskCheck = taskCheck;
        this.duedate = duedate;
        this.userId = userId;
        this.isdeleted = isdeleted;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskCategory() {
        return taskCategory;
    }

    public void setTaskCategory(String taskCategory) {
        this.taskCategory = taskCategory;
    }

    public boolean isTaskCheck() {
        return taskCheck;
    }

    public void setTaskCheck(boolean taskCheck) {
        this.taskCheck = taskCheck;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public boolean isIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    @Override
    public String toString() {
        return "taskentity{" +
                "taskid=" + taskid +
                ", taskName='" + taskName + '\'' +
                ", taskCategory='" + taskCategory + '\'' +
                ", taskCheck=" + taskCheck +
                ", duedate=" + duedate +
                ", userId=" + userId +
                ", isdeleted=" + isdeleted +
                '}';
    }
}
