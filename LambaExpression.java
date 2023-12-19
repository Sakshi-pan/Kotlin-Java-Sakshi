package Java8;

public class LambaExpression {
	public static void main(String[] args) {
		Runnable hello = () -> System.out.println("Hello Lambda");
		hello.run();
		Thread T1=new Thread(() -> System.out.println("Thread exceuted"));
		T1.start();
	}
}
