package br.com.paulocalderan.abstractfactory.app.factory;

import br.com.paulocalderan.abstractfactory.app.services.CarRestApiService;
import br.com.paulocalderan.abstractfactory.app.services.CarService;
import br.com.paulocalderan.abstractfactory.app.services.UserRestApiService;
import br.com.paulocalderan.abstractfactory.app.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }

}
