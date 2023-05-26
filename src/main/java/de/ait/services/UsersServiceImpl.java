package de.ait.services;

import de.ait.models.User;
import de.ait.repositories.UsersRepository;

import java.util.*;

public class UsersServiceImpl implements UsersService {

    private UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<String> getNames() {
        List<User> users = usersRepository.findAll(); // получаем всех пользователей
        List<String> names = new ArrayList<>(); // создаем пустой список имен

        for (User user : users) { // пробегаемся по всем пользователям
            names.add(user.getFirstName()); // добавляем имя пользователя в список имен
        }
        // возвращаем имена
        return names;
    }

    @Override
    public String getLastNameOfMostAging() {
        /*
        Marsel|Sidikov|29|1.85
        Maxim|Ivanov|25|1.79
        Ruslan|Kochkin|41|1.83
        Kirill|Petrov|55|1.90

        29 -> Sidikov
        25 -> Ivanov
        41 -> Kochkin
        55 -> Petrov

        Collections.max(29, 25, 41, 55) -> 55

        return userAge.get(55) -> Petrov

         */
        List<User> users = usersRepository.findAll();
        Map<Integer, String> userAge = new HashMap<>();

        for (User user : users) { // пробегаем по всему списку
            userAge.put(user.getAge(), user.getLastName()); // добавили пару возраст-фамилия
        }

        int maxAge = Collections.max(userAge.keySet()); // находим максимальный возраст

        return userAge.get(maxAge); // возвращаем фамилию, которая лежит под максимальным ключом
    }

    @Override
    public int getAgeOfTheHighest() {
        List<User> users = usersRepository.findAll();
        Map<Double, Integer> userHeight = new HashMap<>();

        for (User user : users) {
            userHeight.put(user.getHeight(), user.getAge());
        }

        double maxHeight = Collections.max(userHeight.keySet());

        return userHeight.get(maxHeight);
    }
    public double getAverageAgeOfUsers() {
        List<User> users = usersRepository.findAll();
        double tempSum = 0.0;
        if (users.size() == 0)
            return 0.0;
        for (User user : users)
            tempSum += user.getAge();
        return tempSum/users.size();
    }
}
