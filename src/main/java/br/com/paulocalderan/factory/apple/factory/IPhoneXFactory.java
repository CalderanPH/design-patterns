package br.com.paulocalderan.factory.apple.factory;

import br.com.paulocalderan.factory.apple.model.IPhone;
import br.com.paulocalderan.factory.apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
