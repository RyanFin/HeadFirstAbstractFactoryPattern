package com.headfirst.domain;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Clams createClam();
	
}
