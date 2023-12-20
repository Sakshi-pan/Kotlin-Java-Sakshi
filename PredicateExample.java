package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(2, 9, 4, 6, 1, 10, 15, 14);
        Predicate<Integer> isEven = num -> num % 2 == 0;

        List<String> strings = Arrays.asList("Sakshi", "Priyal", "Nisha", "Neha", "Ayush");
        Predicate<String> isLength = str -> str.length() > 5;

        strings.stream()
               .filter(isLength)
               .forEach(System.out::println);
        System.out.println("It is next question");

        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println);
        
        Predicate<Integer> salary= x -> x>100000;
        System.out.println(salary.test(10000));
        
        List<Integer> num=Arrays.asList(10,20,25,30,35,40);
        Predicate<Integer> isTen= i->i%10==0;
        for(int e: num) {
        	if(isTen.test(e)) {
        		System.out.println(e);
        	}
        }
	}

}
