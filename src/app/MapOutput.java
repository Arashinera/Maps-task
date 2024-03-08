package app;

import java.util.Map;

public class MapOutput {

    private static int number = 1;

    public static void Output(Map<UuidKey, Product> productMap) {
        productMap.forEach((key, value) ->
                {
                    System.out.println(number + ") " + key + "\n" + value);
                    number++;
                }
        );
    }
}
