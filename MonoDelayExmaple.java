package MonoPackage;

import reactor.core.publisher.Mono;
import java.time.Duration;

public class MonoDelayExmaple {

    public static void main(String[] args) {
    	//Create a Mono that emits a value after a delay. Use the Mono.timeout(Duration) operator to handle the case where the operation takes too long, and print an error message.
        // Create a Mono that emits a value after a delay
        Mono<String> delayedMono = Mono.just("Delayed Value")
                .delayElement(Duration.ofSeconds(2))
                // Use the Mono.timeout(Duration) operator to handle timeout
                .timeout(Duration.ofSeconds(1), Mono.error(new RuntimeException("Operation timed out")));

        // Subscribe to the delayed Mono to consume the result or handle the timeout error
        delayedMono.subscribe(
                result -> System.out.println("Result: " + result),
                error -> System.err.println("Error: " + error.getMessage()),
                () -> System.out.println("Mono completed successfully")
        );
    }
}
