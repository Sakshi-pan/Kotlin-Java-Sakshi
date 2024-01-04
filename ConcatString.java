package MonoPackage;
import reactor.core.publisher.Mono;
public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mono<String> str1=Mono.just("Hello");
		Mono<String> str2=Mono.just("World");
		
		Mono<String> concate=Mono.zip(str1, str2,(a,b)->a+b);
		concate.subscribe(System.out::println);
		
	
		
		
	}

}
