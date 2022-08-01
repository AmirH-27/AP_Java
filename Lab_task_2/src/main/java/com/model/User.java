package com.model;

public class User {
    private int user_id;
    private String name;
    private String id;

    //setter
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    //getter
    public int getUser_id() {
        return user_id;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
}
