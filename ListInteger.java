package Flux;
import reactor.core.publisher.Flux;
import java.util.List;
import java.util.ArrayList;
public class ListInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//You have a Flux of lists, and you need to transform each list into its individual elements.
		//Implement a reactive pipeline to achieve this using flatMap.
		Flux<List<Integer>> list=Flux.just(
				List.of(1,2,3,4,5),
				List.of(4,5,6,78));
		list.flatMap(x->Flux.fromIterable(x)).subscribe(System.out::println);
		
		//You have a Flux of strings, and for each string, you need to find and print the distinct characters. 
		//Implement this using flatMap.
		Flux<String> str= Flux.just("Sakshi", "Pandey");
		str.flatMap(word -> Flux.fromArray(word.split(""))).distinct().subscribe(System.out::println);
		
		//You have a Flux of lists of words, and you need to transform each list into its individual words. 
		//Implement a reactive pipeline to achieve this using flatMap.
		Flux<List<String>> list2=Flux.just(
				List.of("Sakshi","Pandey"),
				List.of("Ayush","Pandey"));
		list2.flatMap(x->Flux.fromIterable(x)).map(x->x.length()).subscribe(System.out::println);
		System.out.println("Length of work");
		/*You have a Flux of sentences, and for each sentence, you need to split it into words and find the length of each word. Implement this using flatMap.
		Tasks:Create a Flux<String> containing sentences.
		Use flatMap to split each sentence into a Flux<String> of its words.
		Use another flatMap to find the length of each word.
		Print the length of each word.*/
		Flux<String> sentence= Flux.just("This is my dog","Let's watch movie", "Hi what are u doing");
		sentence.flatMap(x->Flux.fromArray(x.split(" "))).map(x->x.length()).subscribe(System.out::println);
		
	}

}
