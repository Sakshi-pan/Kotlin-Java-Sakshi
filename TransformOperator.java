package reactive.ReactiveProgram;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
public class TransformOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using Map");
        Observable<Integer> numbers = Observable.just(1, 2, 3, 4, 5);
        numbers.map(x -> x * 2).subscribe(System.out::println);

        System.out.println("Using cast");
        Observable<Object> mixedTypes = Observable.just(1, "two", 3.0, 4, "five");

       
        mixedTypes.ofType(Integer.class).subscribe(
                value -> System.out.println("Received value: " + value),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Observation complete")
        );

        System.out.println("Using delay");
        numbers.delay(1, TimeUnit.SECONDS).subscribe(System.out::println);
        System.out.println("Using scan");
        numbers.scan((a, b) -> a+b).subscribe(System.out::println);
	}

}
