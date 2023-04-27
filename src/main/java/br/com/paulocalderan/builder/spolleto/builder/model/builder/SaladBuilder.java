package br.com.paulocalderan.builder.spolleto.builder.model.builder;

import br.com.paulocalderan.builder.spolleto.builder.model.Salad;

public class SaladBuilder extends MealBuilderOpt {

	public Salad getResult() {
		return new Salad(toppings, sauces, size, cheese, pepper);
	}
}
