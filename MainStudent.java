package IOC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Students stud=(Students)context.getBean("student");
		Students stud1=(Students)context.getBean("student");
		System.out.println(stud);
		System.out.println(stud1);
	}

}
