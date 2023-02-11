package com.example.sql_rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add_user")
    public String adduser(@RequestBody() User user){
        return userService.adduser(user);
    }
    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }
}
