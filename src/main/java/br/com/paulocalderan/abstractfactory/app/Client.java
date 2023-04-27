package br.com.paulocalderan.abstractfactory.app;

import br.com.paulocalderan.abstractfactory.app.factory.EJBAbstractFactory;
import br.com.paulocalderan.abstractfactory.app.factory.ServicesAbstractFactory;
import br.com.paulocalderan.abstractfactory.app.services.CarService;
import br.com.paulocalderan.abstractfactory.app.services.UserService;

public class Client {

    public static void main(String[] args) {
        ServicesAbstractFactory factory = new EJBAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();

        UserService userService = factory.getUserService();
        userService.save("Jhon");
        userService.delete(5);

        CarService carService = factory.getCarService();
        carService.save("Prius");
        carService.update("Tesla X");
    }
}
