package com.yellocode.player.service.impl;

import com.yellocode.player.dto.user.CreateUserRequest;
import com.yellocode.player.dto.user.UserResponse;
import com.yellocode.player.domain.User;
import com.yellocode.player.repository.UserRepository;
import com.yellocode.player.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by DmitryL on 18.07.2017.
 */
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse add(CreateUserRequest createUserRequest) {
        User user = new User();
        user.setLogin(createUserRequest.getLogin());
        user.setEmail(createUserRequest.getEmail());
        user.setPassword(createUserRequest.getPassword());
        User savedUser = userRepository.saveAndFlush(user);
        UserResponse response = new UserResponse(savedUser);
        return response;
    }

    @Override
    public void delete(long id) {
        userRepository.delete(id);
    }

    @Override
    public User edit(long id, User user) {
        User editedUser = userRepository.findOne(id);
        editedUser.setEmail(user.getEmail());
        editedUser.setLogin(user.getLogin());
        editedUser.setPassword(user.getPassword());
        return userRepository.saveAndFlush(editedUser);
    }

    @Override
    public List<User> getAll(int page, int size) {
        return userRepository.findAll();
    }

    @Override
    public User getById(long id) {
        return userRepository.getOne(id);
    }
}
