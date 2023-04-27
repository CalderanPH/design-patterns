package br.com.paulocalderan.factory.apple.factory;

import br.com.paulocalderan.factory.apple.model.IPhone;
import br.com.paulocalderan.factory.apple.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
