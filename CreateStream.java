package Stream1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.DoubleStream;

public class CreateStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// !st way of creating stream(list into stream)
		List<Integer> integer= Arrays.asList(1,2,3,4,5,6);
		Stream<Integer> way1=integer.stream();
		
		//2nd way of creating stream(array to stream)(Since int is primitive datatype so use IntStream, DoubleStream, FloatStream)
		int[] arr= {1,2,3,4,5,6};
		IntStream arrStream= Arrays.stream(arr);
		
		String[] arr1= {"Sakshi", "David", "Zoya"};
		Stream<String> string1=Arrays.stream(arr1);
		
		//3rd way is You can create a stream directly from individual elements or an array of elements using the Stream.of() method:
		Stream<String> streamOfGenerator= Stream.of("English", "Hindi", "Maths");
		Stream<Integer> streamOfInteger= Stream.of(1,2,3,4,56);
		
		//4th way You can create a stream from a range of values using the IntStream, LongStream, or DoubleStream classes:
		IntStream inst= IntStream.range(1,100);
		DoubleStream doub= DoubleStream.rangle(1.0, 100);
		
		//5th way using Stream.generate() You can create an infinite stream using Stream.generate() by providing a Supplier to generate elements:
		Stream<String> infiniteStream = Stream.generate(() -> "hello");
		
		//6th way using Stream.iterator 
		Stream<Integer> sequentialNumbers = Stream.iterate(0, n -> n + 1);

		
		
				
		
		
		
	}

}
