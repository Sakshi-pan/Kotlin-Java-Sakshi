package Stream1;
import java.util.List;
import java.util.Arrays;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using parallel stream");
		List<Integer> number=Arrays.asList(1,2,3,5,6);
		number.parallelStream()
		      .map(x->x*x)
		      .forEach(System.out::println);
		
		
		System.out.println("Using Sequential stream");
		number.stream()
	      .map(x->x*x)
	      .forEach(System.out::println);
	
		

	}

}
