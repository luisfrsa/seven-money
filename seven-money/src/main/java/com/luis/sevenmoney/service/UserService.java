package com.luis.sevenmoney.service;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.luis.sevenmoney.domain.User;
import com.luis.sevenmoney.repository.child.UserRepository;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class UserService {

    private static final String ENTITY_NAME = "user";

    @Autowired
    UserRepository userRepository;

    public void setUsers(List<User> users) {
        userRepository.set(users);
    }

    public List<User> getAll() {
        return userRepository.getAll();
    }
}