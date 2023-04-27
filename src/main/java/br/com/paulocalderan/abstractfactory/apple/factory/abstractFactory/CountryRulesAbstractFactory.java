package br.com.paulocalderan.abstractfactory.apple.factory.abstractFactory;

import br.com.paulocalderan.abstractfactory.apple.model.certificate.Certificate;
import br.com.paulocalderan.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();

    Packing getPacking();
}
