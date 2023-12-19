package Java8;

public class LambdaHood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface fun = () -> System.out.println("Hi from lambda");
        fun.sayHello();
        fun.hi();

	}

}
