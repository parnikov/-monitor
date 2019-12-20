package com.parnikov.checker.controller;

import com.parnikov.checker.entity.User;
import com.parnikov.checker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.findAll());
        return "userList";
    }
    @GetMapping("/user/{id}")
    public String getById( @PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.getById(id) );
        return "showUser";
    }
    @GetMapping("/update/{id}")
    public String update( @PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.getById(id) );
        return "editUser";
    }

    @PostMapping ("/updateUser")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/user/" + user.getId();
    }

    @GetMapping ("/addUser")
    public String createUserPage() {
        return "createUser";
    }

    @PostMapping ("/addUser")
    public String addUser(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id, Model model) {
        userService.delete(id);
        return "redirect:/users";
    }
}
