package com.headfirst.domain.ingredientfactory;

import com.headfirst.Ingredients.FreshClams;
import com.headfirst.Ingredients.MarianaSauce;
import com.headfirst.Ingredients.ReggianoCheese;
import com.headfirst.Ingredients.ThinCrustDough;
import com.headfirst.domain.Cheese;
import com.headfirst.domain.Clams;
import com.headfirst.domain.Dough;
import com.headfirst.domain.PizzaIngredientFactory;
import com.headfirst.domain.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarianaSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		return new FreshClams();
	}

}
