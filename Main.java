package Java8;

public class Main {
	public static void main(String[] args) {
		interface MyInterface {
            void myMethod();
        }
		
        class MyClass implements MyInterface {
            public void myMethod() {
                System.out.println("Hello from the traditional method!");
            }
        }

        // Using a lambda expression
        MyInterface myLambda = () -> System.out.println("Hello from the lambda expression!");

        // Calling the methods
        MyClass traditional = new MyClass();
        traditional.myMethod();

        myLambda.myMethod();
	}
}
