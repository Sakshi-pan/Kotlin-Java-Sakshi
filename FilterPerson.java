package FunctionalProgramming;
import java.util.List;
import java.util.ArrayList;
import java.util.function.*;
import java.util.stream.*;
class Person{
	String name;
	int age;
	double salary;
	
	public Person(String name,int age, double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String getName() {
		return name;
		
	}
	public int getAge() {
		return age;
		
	}
	public double getSalary() {
		return salary;
		
	}
}
public class FilterPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("Sakshi",20,12000.00));
		persons.add(new Person("Ayush",18,10000.00));
		persons.add(new Person("Neha",21,50000.00));
		persons.add(new Person("Nisha",40,40000.00));
		persons.add(new Person("Piyal",35,48000.00));
		persons.stream().filter(person->person.getAge()>30&&person.getSalary()<50000.00).forEach(result->System.out.println(result.getName()));
	}
	

}
