package Java8;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
public class FunctionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		Function<Integer, Integer> funct= x -> x*x;
		List<Integer> result = map(list1,funct);
		System.out.println(result);
	}
	public static <T,R> List<R> map(List<T> list1, Function<T,R> funct){
		List<R> list=new ArrayList<>();
		for(T e : list1) {
			list.add(funct.apply(e));
		}
		return list;
	}
}
