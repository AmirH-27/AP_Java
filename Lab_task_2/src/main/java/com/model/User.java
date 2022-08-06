package com.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "id")
    @NotNull
    @Pattern(regexp = "[0-9]{2}-[0-9]{5}-[1-3]{1}")
    private String id;
    @Column(name = "password")
    @NotNull
    @Pattern(regexp = "[a-zA-Z0-9]{4,}")
    private String password;

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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
