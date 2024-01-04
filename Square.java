package MonoPackage;
import reactor.core.publisher.Mono;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mono<Integer> no=Mono.just(5);
		Mono<Integer> sq=no.map(n->n*n).defaultIfEmpty(0);
		sq.subscribe(System.out::println);
		

	}

}
