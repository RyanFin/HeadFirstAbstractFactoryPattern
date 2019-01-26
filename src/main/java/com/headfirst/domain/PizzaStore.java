package com.headfirst.domain;

import com.headfirst.domain.Pizza;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String item) {
		Pizza pizza;
		
		pizza = createPizza(item);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// Factory method
		public abstract Pizza createPizza(String item);
}
