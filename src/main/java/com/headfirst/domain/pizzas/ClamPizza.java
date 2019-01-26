package com.headfirst.domain.pizzas;

import com.headfirst.domain.Pizza;
import com.headfirst.domain.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
	
	PizzaIngredientFactory ingredientFactory;
	
	

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}



	@Override
	protected void prepare() {
		System.out.println("Preparing: " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		clam = ingredientFactory.createClam();
	}

}
