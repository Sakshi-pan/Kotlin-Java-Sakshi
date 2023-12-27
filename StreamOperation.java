package Stream1;
import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,2,14,14, 10);
		List<Integer> list1 = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(list1);
		
		List<Integer> newList= list1.stream().map(x->x/2).distinct().sorted((a,b) -> b-a).collect(Collectors.toList());
		System.out.println(newList);
		
		List<String> fruits = Arrays.asList("apple", "banana", "orange","grapes","pineapple","papaya");
		List<Integer> lengthsStream = fruits.stream().map(String::length).collect(Collectors.toList());
		System.out.println(lengthsStream);
		
		List<String> length=fruits.stream().limit(5).skip(1).collect(Collectors.toList());
		System.out.println(length);
		
		List<Integer> collect=Stream.iterate(0,n->n+1).limit(10).skip(3).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collects=Stream.iterate(0,n->n+1).map(x->x/2).limit(10).skip(3).distinct().collect(Collectors.toList());
		System.out.println(collects);
		
		System.out.println("Return max");
		Integer integer= Stream.iterate(0,n->n+1).map(x->x/2).limit(10).skip(3).max((a,b)->a-b).get();
		System.out.println(integer);
		
		List<String> fruit = Arrays.asList("apple", "banana", "orange");
		long count = fruit.stream().count();
		System.out.println(count);
		
		List<String> fruites= Arrays.asList("apple", "banana", "orange");

        // Print elements of a stream using forEach
        fruites.stream();
        fruites.forEach(System.out::println);
        
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean anyMatch = numbers.stream().anyMatch(n -> n > 3);
        System.out.println("Any match greater than 3: " + anyMatch);

        boolean allMatch = numbers.stream().allMatch(n -> n > 0);
        System.out.println("All match greater than 0: " + allMatch);

        boolean noneMatch = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("None match less than 0: " + noneMatch);
        
        System.out.println("Use of Sequential stream");
        List<Integer> numbe=Arrays.asList(2,3,4,5,6,7);
        numbe.stream()
                .map(n->n*n)
                .forEach(System.out::println);
        
        System.out.println("Use of parallel stream");
        List<Integer> numberes=Arrays.asList(2,3,4,5,6,7);
        numberes.parallelStream()
                .map(n->n*n)
                .forEach(System.out::println);
           
	}

}
