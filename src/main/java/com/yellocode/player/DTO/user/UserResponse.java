package com.yellocode.player.dto.user;

import com.yellocode.player.domain.User;

/**
 * Created by DmitryL on 28.07.2017.
 */
public class UserResponse {

    private Long id;
    private String login;
    private String email;

    public UserResponse(User user) {
        this.id = user.getId();
        this.login = user.getLogin();
        this.email = user.getEmail();
    }

    public UserResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
