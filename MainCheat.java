package Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MathCheat{
	int cheatId;

	public void setCheatId(int cheatId) {
		this.cheatId = cheatId;
	}

	public void display() {
		System.out.println("This is this math cheat id "+cheatId);
	}
}
class Cheat{
	String name;
	MathCheat math;
	public void setName(String name) {
		this.name = name;
	}
	public void setMath(MathCheat math) {
		this.math = math;
	}
	public void displayInfo() {
		math.display();
		System.out.println(name);
	}
}
public class MainCheat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Cheat stud=context.getBean("cheat1",Cheat.class);
		stud.displayInfo();

	}

}
