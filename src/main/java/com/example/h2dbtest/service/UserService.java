package com.example.h2dbtest.service;

import com.example.h2dbtest.dto.UserDTO;
import com.example.h2dbtest.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User addUser(UserDTO userDTO);

    List<User> getAllUser();

    Optional<User> getUserById(int id);

    User updateUser(int id, UserDTO userDTO);

    String deleteUserById(int id);
}
