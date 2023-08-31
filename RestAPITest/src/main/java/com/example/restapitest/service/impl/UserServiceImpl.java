package com.example.restapitest.service.impl;

import com.example.restapitest.DAO.UserDao;
import com.example.restapitest.db.UserDb;
import com.example.restapitest.dto.UserDto;
import com.example.restapitest.exception.IncorrectPasswordException;
import com.example.restapitest.exception.ResouceNotFoundException;
import com.example.restapitest.model.User;
import com.example.restapitest.request.InsertUserRequest;
import com.example.restapitest.request.UpdateAvatarRequest;
import com.example.restapitest.request.UpdatePasswordRequest;
import com.example.restapitest.request.UpdateUserRequest;
import com.example.restapitest.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userDao.findAll();
        return userList.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public List<UserDto> getUserByName(String name) {
        List<User> user = userDao.findByName(name);
        return user.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public UserDto createUser(InsertUserRequest request) {
        User user =new User();

        user.setId(createId());
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());
        user.setAddress(request.getAddress());
        user.setPassword(request.getPassword());

        UserDb.userList.add(user);
        return mapToDto(user);
    }

    @Override
    public UserDto updateUser(int id, UpdateUserRequest request) {
        for(User user : UserDb.userList) {
            if(user.getId() == id) {
                user.setName(request.getName());
                user.setPhone(request.getPhone());
                user.setAddress(request.getAddress());
                return mapToDto(user);
            }
        }
        throw new ResouceNotFoundException("Not found user");
    }

    @Override
    public String updateAvatar(int id,UpdateAvatarRequest request) {
        for(User user : UserDb.userList) {
            if(user.getId() == id) {
                user.setAvatar(request.getAvatar());
                return user.getAvatar();
            }
        }
        throw new ResouceNotFoundException("Not found user");
    }

    @Override
    public boolean deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    @Override
    public boolean isOldPasswordCorrect(int id, UpdatePasswordRequest rq) {
        List<User> userList = userDao.findAll();
        for(User user : userList) {
            if(user.getPassword().equals(rq.getOldPassword()) && !rq.getNewPassword().equals(rq.getOldPassword())) {
                user.setPassword(rq.getNewPassword());
                return true;
            }
        }
        throw new IncorrectPasswordException("Not found password");
    }

    private int createId() {
        int max = 100;
        int min = UserDb.userList.size() + 1;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public Optional<UserDto> getUserById(int id) {
        Optional<User> user = userDao.findById(id);
        return user.stream().map(this::mapToDto)
                .findFirst();
    }

    @Override
    public String forgotPassword(int id) {
        int max = 100;
        int min = 999;
        List<User> users = userDao.findAll();
        for(User user : users) {
            if(user.getId() == id) {
                user.setPassword(String.valueOf((int)(Math.random() * (max - min + 1) + min)));
                return user.getPassword();
            }
        }
        throw new ResouceNotFoundException("Not found user");
    }


    private UserDto mapToDto(User user) {
        user = userDao.findById(user.getId())
                .orElseThrow(() -> new ResouceNotFoundException("Not found user"));
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .phone(user.getPhone())
                .address(user.getAddress())
                .avatar(user.getAvatar())
                .build();
    }
}
