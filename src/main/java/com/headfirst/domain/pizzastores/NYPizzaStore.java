package com.headfirst.domain.pizzastores;

import com.headfirst.domain.Pizza;
import com.headfirst.domain.PizzaIngredientFactory;
import com.headfirst.domain.PizzaStore;
import com.headfirst.domain.ingredientfactory.NYPizzaIngredientFactory;
import com.headfirst.domain.pizzas.CheesePizza;
import com.headfirst.domain.pizzas.ClamPizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String item) {
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if(item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if(item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		return pizza;
	}
	


}
