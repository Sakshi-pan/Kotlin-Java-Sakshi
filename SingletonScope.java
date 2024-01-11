package Scope;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
class CoffeeMachine{
	boolean isOperational;
	public CoffeeMachine() {
		isOperational=true;
	}
	public void makeCoffee() {
		if(isOperational) {
			System.out.println("Coffee is ready");
		}else {
			System.out.println("Still making coffee");
		}
	}
}
public class SingletonScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        
        CoffeeMachine coffeeMachine1 = context.getBean("coffeeMachine", CoffeeMachine.class);
        CoffeeMachine coffeeMachine2 = context.getBean("coffeeMachine", CoffeeMachine.class);

        coffeeMachine1.makeCoffee();  
        coffeeMachine2.makeCoffee();

	}

}
