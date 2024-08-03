package com.dgn.emptylist.controller;

import com.dgn.emptylist.model.User;
import com.dgn.emptylist.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
    @GetMapping("/getUserOrders/{id}")
    public ResponseEntity<List<String >> getUserOrders(@PathVariable Long id){
        return new ResponseEntity<>(userService.getUserOrders(id),HttpStatus.OK);
    }
}
