package com.example.h2dbtest.respository;

import com.example.h2dbtest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.hibernate.Internal;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
