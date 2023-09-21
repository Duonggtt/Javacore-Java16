package com.example.restapitest.controller;

import com.example.restapitest.dto.UserDto;
import com.example.restapitest.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin
@RequestMapping("/users")
public class UserViewController {


    private final UserService userService;

    public UserViewController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String getAllUsers(Model model) {
        List<UserDto> userList = userService.getAllUsers();
        String title = "Danh sách user";
        model.addAttribute("userList", userList);
        model.addAttribute("title", title);
        return "user-list";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id, Model model) {
        Optional<UserDto> userDto = userService.getUserById(id);
        String title = "User detail";
        model.addAttribute("user",userDto);
        model.addAttribute("title", title);
        return "user-detail";
    }

}
