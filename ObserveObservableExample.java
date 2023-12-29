package reactive.ReactiveProgram;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class ObserveObservableExample {

    public static void main(String[] args) {
        // Step 1: Create an Observable
        Observable<Integer> numberObservable = Observable.just(1, 2, 3, 4, 5);

        // Step 2: Create an Observer
        Observer<Integer> numberObserver = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Subscribed!"); 
                // Called when subscription happens
            }
           

            @Override
            public void onNext(Integer value) {
                System.out.println("Received: " + value); // Called for each emitted item
            }

            @Override
            public void onError(Throwable e) {
                System.err.println("Error: " + e.getMessage()); // Called if an error occurs
            }

            @Override
            public void onComplete() {
                System.out.println("Completed"); // Called when the Observable completes
            }
        };

        // Step 3: Subscribe the Observer to the Observable
        numberObservable.subscribe(numberObserver);
    }
}

