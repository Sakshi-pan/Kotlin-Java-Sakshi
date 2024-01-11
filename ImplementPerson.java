package IOC;
import java.util.Random;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
class Student implements Person{
	public void introduce() {
		System.out.println("I am a student");
	}
}
class Teacher implements Person{
	public void introduce() {
		System.out.println("I am a teacher");
	}
}
class PersonServiceImp1 implements PersonService{
	private final Random random = new Random();

    @Override
    public Person getPerson() {
        if (random.nextBoolean()) {
            return new Student();
        } else {
            return new Teacher();
        }
    }
}
public class ImplementPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService personService = context.getBean(PersonService.class);
        Person person = personService.getPerson();

        person.introduce();

        context.close();

	}

}
