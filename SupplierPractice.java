package Java8;
import java.util.function.*;
public class SupplierPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> string= ()->new String("Sakshi");
		System.out.println(string.get());
		Supplier<Double> num=() -> Math.random();
		System.out.println(num.get());
	}

}
