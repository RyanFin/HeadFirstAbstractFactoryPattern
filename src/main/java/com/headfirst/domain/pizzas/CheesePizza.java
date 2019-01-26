package com.headfirst.domain.pizzas;

import com.headfirst.domain.Pizza;
import com.headfirst.domain.PizzaIngredientFactory;
import com.headfirst.domain.Sauce;

public class CheesePizza extends Pizza{
	
	PizzaIngredientFactory ingredientFactory;
	
	

	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}



	@Override
	protected void prepare() {
		System.out.println("Preparing: " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}


}
