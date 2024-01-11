package IOC;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*This simple example illustrates the concept of constructor injection, 
where the Person class depends on the Address class,
and the dependencies are provided through the constructor during object creation.*/
class People{
	String name;
	Address address;
	People(String name, Address address){
		this.name=name;
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
class Address{
	String city;
	String state;
	
	Address(String city,String state){
		this.city=city;
		this.state=state;
	}
	public String toString() {
		return city+", "+state;
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address("Lucknow","UP");
		People people=new People("Sakshi", address);
		people.displayInfo();
		
	
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieving beans from Spring context
        Address addresss = context.getBean(Address.class);
        People peoples = context.getBean(People.class);

        // Displaying information
        peoples.displayInfo();

        // Closing the Spring context
        context.close();
	}

}
