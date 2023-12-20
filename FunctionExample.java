package Java8;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.List;
public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> length = s -> s.length();
		System.out.println(length.apply("Sakshi"));
		List<String> list= new ArrayList<>();
		list.add("Sakshi");
		list.add("Ayush");
		list.add("David");
		Function<String, Integer> funct=s -> s.length();
		List<Integer> result=map(list,funct);
		System.out.println(result);
		
	}
	private static <T,R> List<R> map(List<T> list, Function<T,R> funct){
		List<R> newList=new ArrayList<>();
		for(T e: list) {
			newList.add(funct.apply(e));
		}
		return newList;
	}

}
