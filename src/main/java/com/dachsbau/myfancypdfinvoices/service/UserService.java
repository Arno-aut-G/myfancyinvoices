package com.dachsbau.myfancypdfinvoices.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dachsbau.myfancypdfinvoices.model.User;

@Service
public class UserService {

    public User findById(String id) {
        String randomName = UUID.randomUUID().toString();
        return new User(id, randomName);
    }
}
