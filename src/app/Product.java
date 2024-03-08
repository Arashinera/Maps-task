package app;

import static app.Constants.CURRENCY;
import static app.Constants.MEASURE;

public class Product {
    private final String productName;
    private final int value;
    private final double price;

    public Product(String productName, int value, double price) {
        this.productName = productName;
        this.value = value;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product name: " +
                productName + "\n" + productName + "'s value: "
                + value + " " + MEASURE + "\n" + productName + "'s price: " + CURRENCY + price +"\n";
    }
}
