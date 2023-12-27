package Stream1;
import java.util.List;
import java.util.Set;
import java.util.stream.*;
import java.util.Arrays;
import java.util.HashSet;
public class PracticeNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a list of strings, filter out the strings that have a length greater than 3, convert them to uppercase, and print the result.
		List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "grape");

		words.stream().filter(x ->x.length()>3).map(x->x.toUpperCase())
		     .forEach(System.out::println);
		
		//Given two sets of integers, find and print the intersection of the sets.
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
		
		set1.stream().filter(set2::contains).forEach(System.out::println);
		
		List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C#", "Ruby");
		List<Integer> result=languages.stream().map(x->x.length()).collect(Collectors.toList());
		System.out.println(result);
		//sum of even number
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum=numbers.stream().filter(x->x%2==0).reduce(0, Integer::sum);
		System.out.println(sum);
		
		//avg of number
		int avg=numbers.stream().reduce(0, (a,b)->a+b)/numbers.size();
		System.out.println(avg);
		
		
		// Write a single line of code using Java Streams to count the total number of words in all sentences combined.
		List<String> sentences = Arrays.asList("Java streams are powerful", "They make code concise", "Functional programming is key");
		long totalWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .count();
		System.out.println(totalWords);
		
		List<Integer> scores = Arrays.asList(80, 95, 63, 45, 75, 90);

		// Write a single line of code using Java Streams to filter out scores greater than or equal to 70.
		List<Integer> passingScores = scores.stream().filter(x->x>=70).collect(Collectors.toList());
		System.out.println(passingScores);
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");

		// Write a single line of code using Java Streams to create a new list containing only the names starting with the letter 'A'.
		List<String> namesStartingWithA = names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
		System.out.println(namesStartingWithA );
		
		
		

		

	}

}
