package Flux;
import reactor.core.publisher.Flux;
class Person1{
	String name;
	int age;
	
	Person1(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class PersonAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flux<Person1> stream1=Flux.just(
				new Person1("Sakshi",23),
				new Person1("Ayush",25),
				new Person1("Poonam",24),
				new Person1("Sam",30)
				
				);
		Flux<Person1> stream2=Flux.just(
				new Person1("Sahi",23),
				new Person1("Ayu",40),
				new Person1("Poo",24)
				
				
				);
		Flux.concat(stream1,stream2).filter(a->a.getAge()>25).subscribe(result->System.out.println(result.getName()));

	}

}
