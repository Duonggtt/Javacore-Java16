package com.example.restapitest.service;


import com.example.restapitest.dto.UserDto;
import com.example.restapitest.model.User;
import com.example.restapitest.request.InsertUserRequest;
import com.example.restapitest.request.UpdateAvatarRequest;
import com.example.restapitest.request.UpdatePasswordRequest;
import com.example.restapitest.request.UpdateUserRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> getAllUsers();

    List<UserDto> getUserByName(String name);

    UserDto createUser(InsertUserRequest request);

    UserDto updateUser(int id, UpdateUserRequest request);

    String updateAvatar(int id, UpdateAvatarRequest request);

    boolean deleteUser(int id);

    boolean isOldPasswordCorrect(int id, UpdatePasswordRequest rq);

    Optional<UserDto> getUserById(int id);

    String forgotPassword(int id);
}
