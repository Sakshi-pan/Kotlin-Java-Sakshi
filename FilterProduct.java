package FunctionalProgramming;
import java.util.List;
import java.util.ArrayList;
import java.util.function.*;
import java.util.stream.*;
class Product{
	String name;
	double price;
	String category;
	
	public Product(String name, double price, String category){
		this.name=name;
		this.price=price;
		this.category=category;
		
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	
}
public class FilterProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> products=new ArrayList<>();
		products.add(new Product("TV",50000.00,"Electronics"));
		products.add(new Product("AC",10000.00,"Electronics"));
		products.add(new Product("Pen",50.00,"Stationary"));
		products.add(new Product("Copy",100.00,"Stationary"));
		products.stream().filter(c->c.getPrice()>100.00&&c.getCategory()=="Electronics").forEach(a->System.out.println(a.getName()));
	}
	

}
