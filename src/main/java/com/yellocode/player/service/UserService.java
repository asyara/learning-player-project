package com.yellocode.player.service;

import com.yellocode.player.dto.user.CreateUserRequest;
import com.yellocode.player.dto.user.UserResponse;
import com.yellocode.player.domain.User;

import java.util.List;

/**
 * Created by DmitryL on 16.07.2017.
 */
public interface UserService {

    UserResponse add(CreateUserRequest user);
    void delete(long id);
    User edit(long id, User user);
    List<User> getAll(int page, int size);
    User getById(long id);

}
