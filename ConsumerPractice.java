package Java8;
import java.util.List;
import java.util.ArrayList;
import java.util.function.*;
import java.util.Arrays;
public class ConsumerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<>();
		list.add("Sakshi");
		list.add("Priyal");
		list.add("David");
		Consumer<String> cons= s -> System.out.println(s);
		for(String ele: list) {
			cons.accept(ele);
		}
		List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7);
		Consumer<Integer> const1= x -> System.out.println(x+1);
		list1.forEach(const1);
		
		
	}
	

}
