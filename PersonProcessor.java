package Flux;
import reactor.core.publisher.Flux;
class Person{
	String name;
	int age;
	
	Person(String name, int age){
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
public class PersonProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flux<Person> stream1=createPerson("Alice", 19,"Bob", 20, "Charlie", 30);
		Flux<Person> stream2=createPerson("David", 29,"Sam", 25, "Frank", 18);
		Flux.concat(stream1,stream2)
		         .filter(a->a.getAge()>25)
		         .subscribe(name->System.out.println(name.getName()));

	}
	static Flux<Person> createPerson(Object...objects ){
		return Flux.create(emitter->{
			for(int i=0;i<objects.length;i+=2) {
				String name=(String) objects[i];
				int age=(int) objects[i+1];
				emitter.next(new Person(name,age));
			}
			emitter.complete();
		}
				
				);
	}

}
