package com.example.EcommerceAPI.Controller;


import com.example.EcommerceAPI.Model.Order;
import com.example.EcommerceAPI.Model.User;
import com.example.EcommerceAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add-user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);

    }
    @GetMapping("/get-user")
    public User getUser(@RequestParam Integer userId){
        return userService.getOrder(userId);
    }
}
