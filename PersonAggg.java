package PracticeObser;
import io.reactivex.rxjava3.core.Observable;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
    	return age;
    }
    public String getName() {
    	return name;
    }

}
public class PersonAggg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] person= {
				new Person("Sakshi",20),
				new Person("Ayush",18)
		};
		Observable.fromArray(person).filter(a->a.getAge()>18).map(a->new Person(a.getName().toUpperCase(), a.getAge())).subscribe(a->System.out.println(a.getName()));

	
	Observable<String> str1=Observable.just("Sakshi","Pandey");
	Observable<String> str2=Observable.just("Ayush","Kumar","Ambikesh");
	
	//Observable.zip(str1, str2, (a, b)->(a+b)).sorted().subscribe(System.out::println);
	Observable.zip(str1, str2, (a,b)->(a+b)).sorted().subscribe(System.out::println);

	Observable.map(x->x.toUpperCase()).filter(x->x.contains("a")).
}
}
