package app;

import java.util.Map;
import java.util.UUID;

public class DataHandler {

    public static Product GetDataElementByKey(Map<UuidKey, Product> productMap, UUID key) {

        return productMap.get(new UuidKey(key));
    }
}
