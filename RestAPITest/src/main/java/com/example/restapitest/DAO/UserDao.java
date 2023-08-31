package com.example.restapitest.DAO;

import com.example.restapitest.model.User;
import com.example.restapitest.request.UpdatePasswordRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface UserDao{
    List<User> findAll();

    boolean deleteUser(Integer id);

    Optional<User> findById(Integer id);
    List<User> findByName(String name);


}
