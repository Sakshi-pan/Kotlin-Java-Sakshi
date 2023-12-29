package reactive.ReactiveProgram;

import io.reactivex.rxjava3.core.Observable;

public class HelloRxJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observable<Integer> observable = Observable.just(1, 2, 3, 4, 5);

        // Subscribe to the Observable to observe the emitted items
        observable.subscribe(
                value -> System.out.println("Received: " + value),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Completed")
				
				
				);
			

	}

}
