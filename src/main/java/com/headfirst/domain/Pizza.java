package com.headfirst.domain;

public abstract class Pizza {
	protected String name;
	
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Clams clam;
	
	protected abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 mins at 350 degrees");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	
	// Setters and Getters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", cheese=" + cheese + ", clams="
				+ clam + "]";
	}
	
	

}
