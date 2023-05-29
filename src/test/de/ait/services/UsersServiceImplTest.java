package de.ait.services;

import de.ait.models.User;
import de.ait.repositories.UsersRepositoryListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersServiceImplTest {
    private UsersServiceImpl usersService;

    @BeforeEach
    void setUp() {
        this.usersService = new UsersServiceImpl(new UsersRepositoryListImpl());
    }

    @Test
    void getNames() {

    }

    @Test
    void getLastNameOfMostAging() {
    }

    @Test
    void getAgeOfTheHighest() {
    }

    @Test
    void getAverageAgeOfUsers() {
    }
}