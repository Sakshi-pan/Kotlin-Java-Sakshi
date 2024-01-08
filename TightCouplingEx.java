package Com;
class Engine{
	public void start() {
		System.out.println("Engines start.....");
	}
}
class Car{
	Engine engine=new Engine();
	public void start() {
		engine.start();
	}
}
public class TightCouplingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.start();

	}

}
