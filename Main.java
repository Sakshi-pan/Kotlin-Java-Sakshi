package com.LooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		PizzaMaking stud=context.getBean("pizza1",PizzaMaking.class);
		stud.pizzaReady();
		PizzaMaking pizza3=context.getBean("pizza2",PizzaMaking.class);
		pizza3.pizzaReady();

	}

}
