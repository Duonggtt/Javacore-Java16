package com.example.restapitest.service.impl;

import com.example.restapitest.dto.UserDto;
import com.example.restapitest.exception.IncorrectPasswordException;
import com.example.restapitest.exception.ResouceNotFoundException;
import com.example.restapitest.model.User;
import com.example.restapitest.repository.UserRepository;
import com.example.restapitest.request.InsertUserRequest;
import com.example.restapitest.request.UpdateAvatarRequest;
import com.example.restapitest.request.UpdatePasswordRequest;
import com.example.restapitest.request.UpdateUserRequest;
import com.example.restapitest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userList.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public List<UserDto> getUserByName(String name) {
        List<User> user = userRepository.findByName(name);
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

        userRepository.save(user);
        return mapToDto(user);
    }

    @Override
    public UserDto updateUser(int id, UpdateUserRequest request) {
        List<User> userList = userRepository.findAll();
        for(User user : userList) {
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
        List<User> userList = userRepository.findAll();
        for(User user : userList) {
            if(user.getId() == id) {
                user.setAvatar(request.getAvatar());
                return user.getAvatar();
            }
        }
        throw new ResouceNotFoundException("Not found user");
    }

    @Override
    public boolean deleteUser(int id) {
        List<User> userList = userRepository.findAll();
        for(User user : userList) {
            if(user.getId() == id) {
                userRepository.deleteById(id);
                return true;
            }
        }return false;
    }

    @Override
    public boolean isOldPasswordCorrect(int id, UpdatePasswordRequest rq) {
        List<User> userList = userRepository.findAll();
        for(User user : userList) {
            if(user.getPassword().equals(rq.getOldPassword()) && !rq.getNewPassword().equals(rq.getOldPassword())) {
                user.setPassword(rq.getNewPassword());
                return true;
            }
        }
        throw new IncorrectPasswordException("Not found password");
    }

    private int createId() {
        List<User> userList = userRepository.findAll();
        int max = 100;
        int min = userList.size() + 1;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public Optional<UserDto> getUserById(int id) {
        Optional<User> user = userRepository.findById(id);
        return user.stream().map(this::mapToDto)
                .findFirst();
    }

    @Override
    public String forgotPassword(int id) {
        int max = 100;
        int min = 999;
        List<User> users = userRepository.findAll();
        for(User user : users) {
            if(user.getId() == id) {
                user.setPassword(String.valueOf((int)(Math.random() * (max - min + 1) + min)));
                return user.getPassword();
            }
        }
        throw new ResouceNotFoundException("Not found user");
    }


    private UserDto mapToDto(User user) {
        user = userRepository.findById(user.getId())
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
