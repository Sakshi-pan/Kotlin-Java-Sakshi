package MonoPackage;
import reactor.core.publisher.Mono;
public class CurrentTimeStamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mono<Long> time=Mono.just(System.currentTimeMillis());
		time.subscribe(System.out::println);

	}

}
