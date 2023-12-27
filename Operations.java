package Stream1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.Optional;
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> color=Arrays.asList(Arrays.asList("Orange","red","blue"), Arrays.asList("Yellow","Green","White"));
		color.stream().flatMap(List::stream).forEach(System.out::println);
		
		
		List<Integer> number=Arrays.asList(1,2,3,4,5);
		Optional<Integer> sum=number.stream().reduce(Integer::sum);
		sum.ifPresent(System.out::println);
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum1 = numbers.stream().reduce(0,Integer::sum);
		System.out.println(sum1); 
		
		int max = numbers.stream().reduce(0, Integer::max);
		System.out.println(max); 
		
		List<String> words=Arrays.asList("Hello","World","!");
		String combined=words.stream().reduce((a,b) -> a+" "+b).orElse("");
		System.out.println(combined);

		

	}

}
