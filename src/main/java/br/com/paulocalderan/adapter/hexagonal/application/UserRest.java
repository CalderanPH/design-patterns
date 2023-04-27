package br.com.paulocalderan.adapter.hexagonal.application;


import br.com.paulocalderan.adapter.hexagonal.core.model.User;
import br.com.paulocalderan.adapter.hexagonal.core.ports.UserRepository;
import br.com.paulocalderan.adapter.hexagonal.core.usecases.UserService;
import br.com.paulocalderan.adapter.hexagonal.infrastructure.UserMemoryDatabaseAdapter;

import java.util.List;
import java.util.Map;

public class UserRest {
    private UserService userFacade;

    public UserRest() {
        UserRepository userRepo = new UserMemoryDatabaseAdapter();
        userFacade = new UserService(userRepo);
    }

    public Integer post(Map<String, String> values) {
        try {
            User user = new User(values.get("name"), values.get("email"), values.get("password"));
            userFacade.saveUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 400;
        }
        return 201;
    }

    public Integer get() {
        List<User> users = userFacade.getUsers();
        users.stream().forEach(System.out::println);
        return 200;
    }
}
