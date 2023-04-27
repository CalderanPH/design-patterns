package br.com.paulocalderan.factory.apple.factory;

import br.com.paulocalderan.factory.apple.model.IPhone;
import br.com.paulocalderan.factory.apple.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
