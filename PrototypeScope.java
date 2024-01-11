package Scope;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
class PizzaChef{
 List<String> toppings = new ArrayList<>();

 public void addTopping(String topping) {
     toppings.add(topping);
 }

 public void makePizza() {
     System.out.println("Making a pizza with toppings: " + toppings);
 }
}

public class PrototypeScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		PizzaChef pizzaChef1 = context.getBean("pizzaChef", PizzaChef.class);
        PizzaChef pizzaChef2 = context.getBean("pizzaChef", PizzaChef.class);

       
        pizzaChef1.addTopping("Pepperoni");
        pizzaChef2.addTopping("Mushrooms");

        pizzaChef1.makePizza();  
        pizzaChef2.makePizza();

	}

}
