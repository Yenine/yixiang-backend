package com.exp.yixiang.entity;

public class User {

    private int userid;
    private String username;
    private String password;
    private int point;
    private byte[] profile;
    public User() {
        this.userid = 0;
        this.username = "master";
        this.password = "111111";
        this.point=10000;
    }
    public User(int userid) {
        this.userid = userid;
    }

    public User(int userid, String username, String password,int point,byte[] profile) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.point=point;
        this.profile=profile;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public byte[] getProfile() {
        return profile;
    }

    public void setProfile(byte[] profile) {
        this.profile = profile;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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
}
