package com.superman.reservationtest.Controller;

import javax.websocket.server.PathParam;

import com.superman.reservationtest.Entity.User;
import com.superman.reservationtest.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/user")
public class UserController {

    private final UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value="")
    public String test(@PathParam(value = "name") String name){
        User user = new User();
        user.setName(name);
        return userService.save(user);
    }

    @GetMapping(value="/remove/{id}")
    public String remove(@PathVariable Long id){
        return userService.remove(id);
    }
    
    @GetMapping(value="/find/{id}")
    public User find(@PathVariable Long id){
        return userService.find(id);
    }
}
