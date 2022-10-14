package com.learning.dockerspringmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private UserRepository userRepository;


    @GetMapping("/")
    public ResponseEntity<User> getRandomUser(){
        return ResponseEntity.ok().body(userRepository.getRandomUser());
    }
}
