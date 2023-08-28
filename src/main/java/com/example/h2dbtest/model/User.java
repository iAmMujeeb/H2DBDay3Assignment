package com.example.h2dbtest.model;

import com.example.h2dbtest.dto.UserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_data")
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String city;

    public User() {
    }

    public User(UserDTO userDTO) {
        this.name = userDTO.name;
        this.city = userDTO.city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
