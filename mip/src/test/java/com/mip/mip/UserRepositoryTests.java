package com.mip.mip;

import com.mip.mip.model.User;
import com.mip.mip.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)

public class UserRepositoryTests {
    @Autowired

    UserRepo repo;


    @Test

    public void tetsCreateUser(){
        PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String rawPassword ="123456ko";
        String encodePassword=passwordEncoder.encode(rawPassword);
        User newUser=new User("carla@gmail.com",encodePassword);
        User savedUser=repo.save(newUser);
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isGreaterThan(0);

    }



}
