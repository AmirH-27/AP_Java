package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@RequestMapping("/dashboard")
@Controller
public class DashboardController {
    private final UserService userService;
    public DashboardController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String dashboard(Model model) {
        ArrayList<User> users = (ArrayList<User>) userService.getAll();
        model.addAttribute("users", users);
        return "dashboard";
    }
}
