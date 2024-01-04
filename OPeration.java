package MonoPackage;
import javax.print.DocFlavor.STRING;

import reactor.core.publisher.Mono;
public class OPeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map
		Mono<String> str= Mono.just("Hello");
		Mono<String> str2=str.map(s->s+"Hello");
		str2.subscribe(System.out::println);
		//flat
		Mono<String> flat=str.flatMap(s->Mono.just(s));
		flat.subscribe(System.out::println);
		
		Mono<Integer> num=Mono.just(4);
		Mono<Integer> ne=num.filter(n->n%2==0);
		ne.subscribe(System.out::println);
		

	}

}
