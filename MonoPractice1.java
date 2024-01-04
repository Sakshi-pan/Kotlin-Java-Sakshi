package MonoPackage;
import reactor.core.publisher.Mono;
public class MonoPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		Mono<Integer> add=Mono.just(a+b);
		add.subscribe(System.out::println);

	}

}
