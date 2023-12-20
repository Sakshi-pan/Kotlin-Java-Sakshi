package Java8;
import java.util.List;
import java.util.function.*;
import java.util.Arrays;

public class ConsumePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Consumer<Integer> consu= x-> {
			if(x%2==0) {
				System.out.println(x);
			}
		};
		
		list1.forEach(consu);
		System.out.println("Length of String");
		List<String> list=Arrays.asList("Sakshi", "Pandey");
		Consumer<String> cons= x-> System.out.println(x.length());


		list.forEach(cons);
		
		
		

	}

}
