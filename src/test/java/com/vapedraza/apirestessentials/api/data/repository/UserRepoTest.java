package com.vapedraza.apirestessentials.api.data.repository;

import com.vapedraza.apirestessentials.api.data.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepoTest {

    @Autowired
    private UserRepo repo;

    private User preUser;

    @BeforeEach
    public void setupTestData(){
        // Setup object or precondition
        preUser = new User();
        preUser.setUuid("uwyteyr-iqueiow-eouiwe");
    }

    @Test
    @DisplayName("JUnit test for get all users from Database")
    // @Rollback This for creation or update methods
    public void findAll(){
        List<User> data = this.repo.findAll();
        Assertions.assertFalse(data.isEmpty());
    }

    @Test
    @DisplayName("JUnit test for create a user in Database")
    // @Rollback(false) only if you need to save test data, by default is Rollback true
    public void create(){
        User userCreated = this.repo.save(preUser);
        Assertions.assertNotNull(userCreated);
        Assertions.assertEquals(userCreated.getUuid(), preUser.getUuid());
    }
}
