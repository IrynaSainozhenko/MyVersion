package de.ait.services;

import de.ait.repositories.UsersRepositoryListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersServiceImplTest {
    private UsersServiceImpl usersService;

    @BeforeEach
    void setUp() {
        this.usersService = new UsersServiceImpl(
                new UsersRepositoryListImpl());
    }

//    1. Вывести имена всех пользователей
    @Test
    public void getNames() {
        List<String> actual = usersService.getNames();
        List<String> expected = Arrays.asList("Amina", "Anna", "Dmytro");
        assertEquals(expected,actual);
    }

//  2. Вывести фамилию самого взрослого пользователя
      @Test
    public void getLastNameOfMostAging() {
        String actuals = usersService.getLastNameOfMostAging();
        String expected = "Lukash";
        assertEquals(expected, actuals);
    }

//  4. Вывести средний возраст всех пользователей
    @Test
    public void getAverageAgeOfUsers() {
        double actuals = usersService.getAverageAgeOfUsers();
        double expected = (22 + 20 + 27) / 3;
        assertEquals(expected, actuals);
    }

    //  5. Вывести возраст самого высокого человека
    @Test
    public void getAgeOfTheHighest() {
        int actuals = usersService.getAgeOfTheHighest();
        int expected = 20;
        assertEquals(expected, actuals);
    }

//    6. Вывести имя и фамилию самого низкого человека
    @Test
    public void getShortestPersonFullName(){
        String actuals = usersService.getShortestPersonFullName();
        String expected = "Amina Zolotoverkh";
        assertEquals(expected, actuals);
    }
}