package de.ait.repositories;

import de.ait.models.User;

import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryListImpl implements UsersRepository {
    private List<User> users = new ArrayList<>(List.of(
            new User("Amina", "Zolotoverkh", 22, 1.70),
            new User("Anna", "Didenko", 20, 1.80),
            new User("Dmytro", "Lukash", 27, 1.78)
            ));
    @Override
    public List<User> findAll() {
        /*User user = new User("User1", "User1", 20, 1.81);
        User user1 = new User("User2", "User2", 25, 1.85);
        User user2 = new User("User3", "User3", 30, 1.90);

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
*/
        return users;
    }

    @Override
    public void saveNewUser(User user) {
        users.add(user);
    }
}

