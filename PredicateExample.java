package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=Arrays.asList(2,9,4,6,1,10,15,14);
		Predicate<Integer> isEven=num -> num%2==0;
		
		number.stream()
		.filter(isEven)
		.forEach(System.out::println);
	}

}
