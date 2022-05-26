/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author PhuocTQ
 */
public class User {

    private int user_id;
    private String username;
    private String password;
    private int roll_number;
    private String fullname;
    private int gender;
    private Date dob;
    private String email;
    private String mobile;
    private String avatar_link;
    private String face_link;
    private int role_id;
    private int status;

    public User() {
    }

    public User(int user_id, String username, String password, int roll_number, String fullname, int gender, Date dob, String email, String mobile, String avatar_link, String face_link, int role_id, int status) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.roll_number = roll_number;
        this.fullname = fullname;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.mobile = mobile;
        this.avatar_link = avatar_link;
        this.face_link = face_link;
        this.role_id = role_id;
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAvatar_link() {
        return avatar_link;
    }

    public void setAvatar_link(String avatar_link) {
        this.avatar_link = avatar_link;
    }

    public String getFace_link() {
        return face_link;
    }

    public void setFace_link(String face_link) {
        this.face_link = face_link;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
