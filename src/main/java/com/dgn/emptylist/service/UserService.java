package com.dgn.emptylist.service;

import com.dgn.emptylist.model.User;
import com.dgn.emptylist.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public List<String> getUserOrders(Long id){
        return userRepository.findById(id)
                .map(user -> user.getOrders())
               .orElseGet(Collections::emptyList);
    }
}
