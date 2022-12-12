package conditionals;

import java.util.Scanner;

public class SwitchEnhanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a fruit name: ");
        String fruit = sc.next();

        switch (fruit) {
            case "mango" -> System.out.println("The King of Fruits");
            case "apple" -> System.out.println("A sweet red fruit");
            case "orange" -> System.out.println("Round Fruit");
            case "grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Fruit Not Listed");
        }
    }

}
