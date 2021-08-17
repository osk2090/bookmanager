package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
        userRepository.save(new User("david", "david@fastcampus.com"));
        User user = userRepository.findById(1L).orElseThrow(null);
        user.setEmail("martin-updated@fastcampus.com");
        userRepository.save(user);
    }

    @Test
    void select() {
        System.out.println(userRepository.findByName("dennis"));

        System.out.println("findByEmail : " + userRepository.findByEmail("martin@another.com"));
        System.out.println("getByEmail : " + userRepository.getByEmail("martin@another.com"));
        System.out.println("readByEmail : " + userRepository.readByEmail("martin@another.com"));
        System.out.println("queryByEmail : " + userRepository.queryByEmail("martin@another.com"));
        System.out.println("searchByEmail : " + userRepository.searchByEmail("martin@another.com"));
        System.out.println("streamByEmail : " + userRepository.streamByEmail("martin@another.com"));
        System.out.println("findUserByEmail : " + userRepository.findUserByEmail("martin@another.com"));
        System.out.println("---------------------------------");

        System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
        System.out.println("findFirst1ByName : " + userRepository.findFirst1ByName("martin"));
        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin"));
    }
}