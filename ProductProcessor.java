package Flux;

import reactor.core.publisher.Flux;

class Product {
    String productId;
    double price;
    double discount;

    Product(String productId, double price, double discount) {
        this.productId = productId;
        this.price = price;
        this.discount = discount;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }
}

public class ProductProcessor {

    public static void main(String[] args) {
        Flux<Product> stream1 = createProduct("P1", 100.0, 5.0, "P2", 120.0, 10.0);
        Flux<Product> stream2 = createProduct("P3", 120.0, 8.0, "P4", 110.0, 15.0);

        Flux.concat(stream1, stream2)
                .map(product -> {
                    double discountedPrice = product.getPrice() * (1 - product.getDiscount() / 100);
                    return new Product(product.getProductId(), discountedPrice, 0.0);
                })
                .subscribe(product -> System.out.println("Discounted Price for " + product.getProductId() + ": " + product.getPrice()));
    }

    static Flux<Product> createProduct(Object... objects) {
        return Flux.create(emitter -> {
            for (int i = 0; i < objects.length; i += 3) {
                String productId = (String) objects[i];
                double price = (double) objects[i + 1];
                double discount = (double) objects[i + 2];
                emitter.next(new Product(productId, price, discount));
            }
            emitter.complete();
        });
    }
}
