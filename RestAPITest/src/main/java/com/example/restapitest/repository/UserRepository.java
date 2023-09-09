package com.example.restapitest.repository;

import com.example.restapitest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();

    List<User> findByName(String name);

    Optional<User> findById(Integer id);

    void deleteById(Integer id);

}
