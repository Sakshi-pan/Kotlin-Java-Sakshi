package reactive.ReactiveProgram;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class DisposableExample {

    public static void main(String[] args) {
        // Step 1: Create an Observable
        Observable<Integer> numberObservable = Observable.just(1, 2, 3, 4, 5);

        // Step 2: Create an Observer
        Observer<Integer> numberObserver = new Observer<Integer>() {
            private Disposable disposable; // Store the Disposable for later use

            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("Subscribed!");
                disposable = d; // Store the Disposable
            }

            @Override
            public void onNext(Integer value) {
                System.out.println("Received: " + value);
                if (value == 3) {
                    disposable.dispose(); // Dispose the subscription when value is 3
                    System.out.println("Disposed the subscription");
                }
            }

            @Override
            public void onError(Throwable e) {
                System.err.println("Error: " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Completed");
            }
        };

        // Step 3: Subscribe the Observer to the Observable
        numberObservable.subscribe(numberObserver);
    }
}
