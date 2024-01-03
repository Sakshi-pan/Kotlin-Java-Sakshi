package reactive.ReactiveProgram;
import io.reactivex.rxjava3.core.Observable;
public class ReduceOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Observable<Integer> numbers = Observable.just(1, 2, 3, 4, 5);
         numbers.count().subscribe(count -> System.out.println("Count: " + count));
         

         numbers.reduce((accumulator, next) -> accumulator + next).subscribe(
                 result -> System.out.println("Sum: " + result)
         );

         numbers.contains(3).subscribe(contains -> System.out.println("Contains 3: " + contains));
         
         numbers.all(x -> x > 0).subscribe(allPositive -> System.out.println("All positive: " + allPositive));
         
         numbers.any(x -> x % 2 == 0).subscribe(hasEvenNumber -> System.out.println("Has even number: " + hasEvenNumber));
	}

}
