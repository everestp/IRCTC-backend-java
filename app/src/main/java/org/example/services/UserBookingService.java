package org.example.services;
import com.fasterxml.jackson.core.type.TypeReference;
import  com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;

import java.io.File;
import java.util.List;

public class UserBookingService {
    private User user;
    private List<User> userList;

    private  ObjectMapper objectMapper = new ObjectMapper();


    private static final String USER_PATH ="../localdb/users.json";
    public  UserBookingService(User user){
        this.user =user;
        File users = new File(USER_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {})

}
