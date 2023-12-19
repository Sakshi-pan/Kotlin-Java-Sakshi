package Java8;
@FunctionalInterface
//as this interface contains two abstract method and when we write annotation it start giving error as functional interface contains only one abstract method
public interface MyInterface {
	void sayHello();
	//public void sayBye();
	default void hi() {
		System.out.println("Hi from default method");
	}

}
