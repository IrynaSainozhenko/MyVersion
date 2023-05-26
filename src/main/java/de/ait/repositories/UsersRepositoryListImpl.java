package de.ait.repositories;

import de.ait.models.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryListImpl implements UsersRepository {
    @Override
    public List<User> findAll() {
        User user = new User("Alexandr", "Didenko", 41, 1.80);
        User user1 = new User("Amina", "Zolotoverkh", 22, 1.65);
        User user2 = new User("Anna", "Ischenko", 35, 1.71);

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);

        return users;
    }
}
