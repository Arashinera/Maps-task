package app;

import java.util.*;

public class ProductDataOutput {

    public static void DataOutput(Map<UuidKey, Product> productMap) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        try {
            int choice;
            do {
                System.out.print("""
                        
                        Please, choose option:
                        1) Get Data
                        2) Exit
                        """);
                choice = input.nextInt();
            } while (choice < 1 || choice > 2);

            switch (choice) {
                case 1:
                    MapOutput.Output(productMap);
                    break;
                case 2:
                    System.exit(0);
                    break;
            }

            do {
                System.out.print("""
                        
                        Please, choose option:
                        1) Get Product by key
                        2) Exit
                        """);
                choice = input.nextInt();
            } while (choice < 1 || choice > 2);

            switch (choice) {
                case 1:
                    System.out.println("Please, enter your key: ");
                    input.nextLine();
                    try {
                        String key = input.nextLine();

                        //Використовуємо метод класу UUID для конвертації значення String у значення UUID:
                        Product product = DataHandler.GetDataElementByKey(productMap, UUID.fromString(key));
                        System.out.println(product);
                    } catch (IllegalArgumentException exception){
                        System.out.println("Data Not Found...");
                    }

                    break;
                case 2:
                    System.exit(0);
                    break;
            }

        } catch (InputMismatchException exception) {
            System.out.println("Please, input integer value...");
        }
    }
}
