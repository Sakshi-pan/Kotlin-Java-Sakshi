package IOC;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

interface Engine{
	void start();
}
class Car{
	private Engine engine;
	public Car(Engine engine) {
		this.engine= engine;
	}
	public void start() {
		engine.start();
		System.out.println("Car started");
	}
}
class GasEngine implements Engine{
	public void start() {
		System.out.println("Engines start");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        car.start();

	}

}
