package PracticeQuestion;
import io.reactivex.rxjava3.core.Observable;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new observable that concatenates the values emitted by source1 and source2 and prints the concatenated values.
		Observable<String> str=Observable.just("A","B","C");
		Observable<String> str2=Observable.just("D","E","F");
		
		Observable.concat(str,str2).subscribe(System.out::println);
		
		/*Create an observable that emits integers from 1 to 5, applies a 
		 * transformation to double each value, and then prints the transformed values. 
		 * Use both map and scan operators.
		 */
		Observable<Integer> numbers=Observable.range(1, 5);
		numbers.map(x->2*x).scan((a,b)->a+b).subscribe(System.out::println);
		
		Observable<String> names = Observable.just("Alice", "Bob", "Charlie");
		Observable<Integer> ages = Observable.just(25, 30, 35);

		
	}

}
