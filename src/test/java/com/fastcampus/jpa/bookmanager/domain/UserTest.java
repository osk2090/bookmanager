package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void test() {
        User user = new User();
        user.setEmail("martin@fastcamp.com");
        user.setName("martin");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User(null, "martin", "martin@fastcamp.com", LocalDateTime.now(), LocalDateTime.now(), null);
        User user2 = new User("martin", "martin@fastcamp.com");

        User user3 = User.builder()
                .name("martin")
                .email("martin@fastcamp.com")
                .build();

        System.out.println(">>> " + user.toString());
    }
}