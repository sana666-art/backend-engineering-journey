package com.vinncorp.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    // JPA/Hibernete > database
    //UserDaoService > Static List

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 0;

//    static {
//        users.add(new User(++usersCount,"Adam", LocalDate.now().minusYears(30), "adam123@gmail.com"));
//        users.add(new User(++usersCount,"Rima", LocalDate.now().minusYears(25), "rima@gmail.com"));
//        users.add(new User(++usersCount,"Rio", LocalDate.now().minusYears(23), "riorock@gmail.com"));
//        users.add(new User(++usersCount,"Jim", LocalDate.now().minusYears(20), "jimrim@gmail.com"));
//        users.add(new User(++usersCount,"Julia", LocalDate.now().minusYears(19), "julia123@gmail.com"));
//        users.add(new User(++usersCount,"John", LocalDate.now().minusYears(24), "john3@gmail.com"));
//        users.add(new User(++usersCount,"Eve", LocalDate.now().minusYears(29), "eve2@gmail.com"));
//
//    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

}