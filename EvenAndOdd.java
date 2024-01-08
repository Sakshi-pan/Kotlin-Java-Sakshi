package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface MyInterface{
	boolean check(String str);
}
public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Sakshi","Ayush");
		list.stream().filter(s->s.length()%2==0).forEach(System.out::println);
		list.stream().filter(s->s.length()%2!=0).forEach(System.out::println);
	}

}
