package MonoPackage;
import reactor.core.publisher.Mono;
public class MonoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mono<String> str=Mono.just("Hello");
		str.subscribe(
                value -> System.out.println("Received: " + value),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Mono completed")
        );
	}

}
