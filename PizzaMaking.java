package com.LooseCoupling;

public class PizzaMaking {
	private Pizza pizza;

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public void pizzaReady() {
		pizza.makePizza();
		System.out.println("Pizza is ready");
	}

}
