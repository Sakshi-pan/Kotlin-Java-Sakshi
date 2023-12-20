package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=Arrays.asList(10,20,25,30,35,40);
        Predicate<Integer> isTen= i->i%10==0;
        for(int e: num) {
        	if(isTen.test(e)) {
        		System.out.println(e);
        	}
        }

	}

}
