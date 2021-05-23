package com.superman.reservationtest.Controller;

import java.util.List;

import com.superman.reservationtest.Entity.User;
import com.superman.reservationtest.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

  private final UserService userService;

  @Autowired
  UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(value = "")
  public String save(@RequestParam(value = "name") String name) {
    User user = new User();
    user.setName(name);
    return userService.save(user);
  }

  @GetMapping(value = "")
  public List<User> find() {
    return userService.findAll();
  }

  @GetMapping(value = "{id}")
  public User find(@PathVariable Long id) {
    return userService.find(id);
  }

  @PostMapping(value = "")
  public String save(@RequestBody User user) {
    return userService.save(user);
  }

}
