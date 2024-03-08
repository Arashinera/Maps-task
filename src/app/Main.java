package app;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<UuidKey, Product> productMap = ProductMap.ProductMapCreate();
        ProductDataOutput.DataOutput(productMap);
    }
}
