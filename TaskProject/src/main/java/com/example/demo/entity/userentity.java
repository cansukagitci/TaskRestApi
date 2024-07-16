package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class userentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userid;
    @Column(name="user_Name")
    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="is_deleted")
    private boolean isdeleted;


    public userentity(){}

    public userentity(String userName, String password, boolean isdeleted) {
        this.userName = userName;
        this.password = password;
        this.isdeleted = isdeleted;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    @Override
    public String toString() {
        return "userentity{" +
                "userid=" + userid +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", isdeleted=" + isdeleted +
                '}';
    }
}
