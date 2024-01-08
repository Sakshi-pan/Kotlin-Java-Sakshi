package FunctionalProgramming;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;
import java.util.stream.*;
import java.util.function.BiConsumer;
public class MapQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map1=new HashMap<>();
		map1.put(1, 1000);
		map1.put(2, 2000);
		map1.put(3, 50);
		map1.put(4, 1000);
		Map<Integer,Integer> map2=new HashMap<>();
		map2.put(1, 1000);
		map2.put(5, 200);
		map2.put(3, 50);
		map2.put(6, 1000);
		
		Map<Integer,Integer> hash=new HashMap<>();
		BiConsumer<Integer,Integer> consum=(key,value)->{
			if(map2.containsKey(key)) {
				hash.put(key, value+map2.get(key));
			}
		};
		map1.forEach(consum);
		System.out.println(hash);
			}

}
