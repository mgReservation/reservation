package com.superman.reservationtest.Service;

import com.superman.reservationtest.Entity.User;
import com.superman.reservationtest.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public String save(User user){
        userRepository.save(user);

        return "Success";
    }

    public String remove(Long id){
        userRepository.deleteById(id);

        return "success";
    }

    public User find(Long id){
        User user = userRepository.findById(id).orElseGet(null);
        user.getSeatList();
        return user;
    }

}
