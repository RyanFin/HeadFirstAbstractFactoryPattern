package com.headfirst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.headfirst.domain.PizzaStore;
import com.headfirst.domain.pizzas.ClamPizza;
import com.headfirst.domain.pizzastores.NYPizzaStore;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	private static PizzaStore nyPizzaStore = new NYPizzaStore();
    
	@BeforeClass
	public static void setUp() {
		nyPizzaStore.orderPizza("cheese");
		
	}
	
    @Test
    public void getNameOfNewYorkCheesePizzaTest(){
       assertEquals("New York Style Cheese Pizza", nyPizzaStore.orderPizza("cheese").getName());
    }
    
    @Test
    public void clamPizzaTypeTest() {
    	assertThat(nyPizzaStore.orderPizza("clam"), instanceOf(ClamPizza.class));
    }
}
