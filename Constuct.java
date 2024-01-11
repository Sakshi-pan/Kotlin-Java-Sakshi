package Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Student{
	private String studentName;
	private int studentId;
	public Student(String studentName, int studentId) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
	}
	
	public void display() {
		System.out.println(studentName+", "+studentId);
	}
}
public class Constuct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student stud=context.getBean("student",Student.class);
		stud.display();

	}

}
