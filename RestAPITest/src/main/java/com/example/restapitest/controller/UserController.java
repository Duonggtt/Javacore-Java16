package com.example.restapitest.controller;

import com.example.restapitest.dto.UserDto;
import com.example.restapitest.request.InsertUserRequest;
import com.example.restapitest.request.UpdateAvatarRequest;
import com.example.restapitest.request.UpdatePasswordRequest;
import com.example.restapitest.request.UpdateUserRequest;
import com.example.restapitest.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllCourse(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int limit) {
        List<UserDto> userDtoList = userService.getAllUsers();
        return ResponseEntity.ok(userDtoList);
    }

    @GetMapping("/search")
    public ResponseEntity<List<UserDto>> getUserbyName(@RequestParam String name) {
        List<UserDto> userDtoList = userService.getUserByName(name);
        return ResponseEntity.ok(userDtoList);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<Optional<UserDto>> getUserById(@PathVariable int id) {
        Optional<UserDto> userDto = userService.getUserById(id);
        return ResponseEntity.ok(userDto);
    }

    @PostMapping("/users")
    public ResponseEntity<UserDto> createUser(@RequestBody InsertUserRequest request) {
        UserDto user = userService.createUser(request);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable int id ,@RequestBody UpdateUserRequest request) {
        UserDto user = userService.updateUser(id, request);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {
        return ResponseEntity.ok(userService.deleteUser(id));
    }

    @PutMapping("/users/{id}/update-avatar")
    public ResponseEntity<?> updateAvatar(@PathVariable int id, @RequestBody UpdateAvatarRequest rq) {
        return ResponseEntity.ok(userService.updateAvatar(id,rq));
    }

    @PutMapping("/users/{id}/update-password")
    public ResponseEntity<?> updatePassword(@PathVariable int id,@RequestBody UpdatePasswordRequest rq) {
        return ResponseEntity.ok(userService.isOldPasswordCorrect(id,rq));
    }

    @PostMapping("/users/{id}/forgot-password")
    public ResponseEntity<String> forgotPassword(@PathVariable int id) {
        return ResponseEntity.ok(userService.forgotPassword(id));
    }

}
