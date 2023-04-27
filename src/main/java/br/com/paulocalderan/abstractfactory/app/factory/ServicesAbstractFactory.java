package br.com.paulocalderan.abstractfactory.app.factory;

import br.com.paulocalderan.abstractfactory.app.services.CarService;
import br.com.paulocalderan.abstractfactory.app.services.UserService;

public interface ServicesAbstractFactory {

    UserService getUserService();

    CarService getCarService();
}
