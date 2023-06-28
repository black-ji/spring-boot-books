package com.ost.Ktob.service;

import com.ost.Ktob.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    void makeAdmin(String username);

    Optional<User> findByUserName(String username);
}
