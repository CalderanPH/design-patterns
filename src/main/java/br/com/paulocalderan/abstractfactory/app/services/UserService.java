package br.com.paulocalderan.abstractfactory.app.services;

public interface UserService {
    void save(String name);

    boolean delete(Integer id);
}
