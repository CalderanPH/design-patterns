package br.com.paulocalderan.factory.apple.factory;

import br.com.paulocalderan.factory.apple.model.IPhone;
import br.com.paulocalderan.factory.apple.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
