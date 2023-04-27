package br.com.paulocalderan.abstractfactory.app.factory;

import br.com.paulocalderan.abstractfactory.app.services.CarEJBService;
import br.com.paulocalderan.abstractfactory.app.services.CarService;
import br.com.paulocalderan.abstractfactory.app.services.UserEJBService;
import br.com.paulocalderan.abstractfactory.app.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }

}



