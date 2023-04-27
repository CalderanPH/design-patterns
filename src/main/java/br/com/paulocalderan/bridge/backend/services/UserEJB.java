package br.com.paulocalderan.bridge.backend.services;


import br.com.paulocalderan.bridge.backend.dao.UserDao;
import br.com.paulocalderan.bridge.backend.model.User;

public class UserEJB extends UserService {

    public UserEJB(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through EJB Protocol!");
        dao.save(user);
    }
}
