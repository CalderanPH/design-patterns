package br.com.paulocalderan.builder.spolleto.builder.model.builder;

import br.com.paulocalderan.builder.spolleto.builder.model.Pasta;

public class PastaBuilder extends MealBuilderOpt {

	public Pasta getResult() {
		return new Pasta(toppings, sauces, size, cheese, pepper);
	}
}
