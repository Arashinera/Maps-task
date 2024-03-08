package app;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Scanner;
import java.util.Locale;

public class ProductMap {

    public static Map<UuidKey, Product> ProductMapCreate() {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        //Використовуємо UUID в якості ключа для Map:
        Map<UuidKey, Product> productMap = new HashMap<>();

        String productName;
        int value;
        double price;

        for (int i = 0; i < 4; i++) {
            System.out.println("Please, enter product name: ");
            productName = input.nextLine();
            System.out.println("Please, enter product value: ");
            value = input.nextInt();
            System.out.println("Please, enter product price: ");
            price = input.nextDouble();
            input.nextLine();

            UUID key = UUID.randomUUID();
            UuidKey uuidKey = new UuidKey(key);

            productMap.put(uuidKey, new Product(productName, value, price));
        }

        return productMap;
    }
}
