package com.example.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

    @NotNull
    @Size(min=2, max=30)
    public String username;

    @NotNull
    @Size(min=2, max=30)
    public String password;

    @Override
    public String toString() {
        return "LoginForm{" +
                "userName='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}