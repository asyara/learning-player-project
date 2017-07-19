package com.yellocode.player.service;

import com.yellocode.player.domain.User;

import java.util.List;

/**
 * Created by DmitryL on 16.07.2017.
 */
public interface UserService {

    User addUser(User user);
    void delete(long id);
    User editUser(User user);
    List<User> getAll();

}
