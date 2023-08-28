package com.example.h2dbtest.service;

import com.example.h2dbtest.dto.UserDTO;
import com.example.h2dbtest.model.User;
import com.example.h2dbtest.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(UserDTO userDTO) {
        User userData = new User(userDTO);
        return userRepository.save(userData);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(int id, UserDTO userDTO) {
        Optional<User> userData = getUserById(id);
        if(userData.isPresent()){
            userData.get().setName(userDTO.name);
            userData.get().setCity(userDTO.city);
            return userRepository.save(userData.get());
        }
        return null;
    }

    @Override
    public String deleteUserById(int id) {
        Optional<User> userData = getUserById(id);
        if(userData.isPresent()){
            userRepository.deleteById(id);
            return "User Deleted Successfully!";
        }
        return "Failed!";
    }

}
