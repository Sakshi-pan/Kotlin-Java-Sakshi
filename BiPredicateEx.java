package Java8;
import java.util.function.*;
public class BiPredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> bi = (x,y)-> x%2==0 && y%2==0;
		System.out.println(bi.test(4, 6));
		BiPredicate<String, Integer> str=(x,y) -> x.length()==y;
		System.out.println(str.test("Sakshi", 6));
		BiFunction<String, String, String> result=(x,y) -> x+" "+y;
		System.out.println(result.apply("Sakshi", "Pandey"));
		BiConsumer<String, String> str2=(x,y) -> System.out.println(x+" "+y);
		str2.accept("Ayush", "Pandey");
	}

}
