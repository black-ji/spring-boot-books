package com.ost.Ktob.service;

import com.ost.Ktob.model.Role;
import com.ost.Ktob.model.User;
import com.ost.Ktob.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setSub_date(LocalDateTime.now());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUserName(String username)
    {
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional
    public void makeAdmin(String username)
    {
        userRepository.updateUserRole(username,Role.ADMIN);
    }
}
