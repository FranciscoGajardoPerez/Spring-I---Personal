package com.example.be_java_hisp_w19_g2.repositories;

import com.example.be_java_hisp_w19_g2.entities.Post;
import com.example.be_java_hisp_w19_g2.entities.Product;
import com.example.be_java_hisp_w19_g2.entities.User;
import com.example.be_java_hisp_w19_g2.handlers.UserNotFoundException;
import com.example.be_java_hisp_w19_g2.handlers.UserNotSeller;
import com.example.be_java_hisp_w19_g2.roles.Roles;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository {
    public List<User> users = new ArrayList<>();

    public UserRepository() {
        this.users = userList();
    }

    public List<User> userList() {
        users.add(new User(1, "Fran", Roles.USER));
        users.add(new User(2, "Brahi", Roles.USER));
        users.add(new User(3, "Erick", Roles.USER));
        users.add(new User(4, "Juli", Roles.USER));
        users.add(new User(5, "Martin", Roles.USER));
        users.add(new User(6, "Mati", Roles.SELLER));
        users.add(new User(7, "Agus", Roles.SELLER));
        users.add(new User(8, "Cele", Roles.SELLER));
        users.add(new User(9, "Lu", Roles.SELLER));
        users.add(new User(10, "Nico", Roles.SELLER));
        return users;
    }

    public User getUserById(Integer userId) {
//        List<User> users = userList();
        return this.users.stream()
            .filter(u -> u.getUserId().equals(userId))
            .findFirst()
            .orElseThrow(() -> {
                throw new UserNotFoundException("User not found: " + userId);
            });
    }
}
