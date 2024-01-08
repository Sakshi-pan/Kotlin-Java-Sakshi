package FunctionalProgramming;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.List;

import java.util.stream.*;

public class StringToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("Sakshi","Ayush","Neha");
		Map<String,Integer> map=list.stream().collect(Collectors.toMap(str->str,String::length));
		System.out.println(map);
		
		Function<String,String> str=s->s.toUpperCase();
		System.out.println(str.apply("Sakshi"));
		

	}

}
