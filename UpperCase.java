package MonoPackage;
import reactor.core.publisher.Mono;
public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mono<String> str= Mono.just("Hello");
		Mono<String> result=str.map(s->s.toUpperCase()).defaultIfEmpty("Sorry");
		result.subscribe(System.out::println);

	}

}
