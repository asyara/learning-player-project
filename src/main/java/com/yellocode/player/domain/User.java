package com.yellocode.player.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends AbstractDomain {

    @Column(name = "login", nullable = false, insertable = true, updatable = true, length = 255)
    private String login;
    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 255)
    private String email;
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 255)
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
