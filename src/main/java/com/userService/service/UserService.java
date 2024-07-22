package com.userService.service;

import com.userService.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface UserService {
    Long createUser(User user) throws Exception;
    void updateUserById(Long userId, User user) throws Exception;
    void deleteUserById(Long userId) throws Exception;
    User getUserById(Long userId) throws JsonProcessingException;
}
