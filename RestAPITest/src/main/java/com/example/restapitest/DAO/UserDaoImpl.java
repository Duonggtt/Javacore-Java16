package com.example.restapitest.DAO;

import com.example.restapitest.db.UserDb;
import com.example.restapitest.model.User;
import com.example.restapitest.request.UpdatePasswordRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public List<User> findAll() {
        return UserDb.userList;
    }

    @Override
    public boolean deleteUser(Integer id) {
        return UserDb.userList.removeIf(user -> user.getId() == id);
    }

    @Override
    public Optional<User> findById(Integer id) {
        return UserDb.userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    @Override
    public List<User> findByName(String name) {
        return UserDb.userList.stream()
                .filter(user -> user.getName().contains(name))
                .collect(Collectors.toList());
    }
}
