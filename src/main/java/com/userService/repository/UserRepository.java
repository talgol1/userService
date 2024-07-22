package com.userService.repository;

import com.userService.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface UserRepository {
    Long createUser(User user);
    User getUserById(Long userId) throws JsonProcessingException;
    void updateUserById (Long userId, User user);
    void deleteUserById(Long userId);


}
