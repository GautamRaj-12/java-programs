package conditionals;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a fruit name: ");
        String fruit = sc.next();

/*
        if(fruit.equals("mango")){
            System.out.println("The King of fruits");
        }
        else if(fruit.equals("apple")){
            System.out.println("A sweet red fruit");
        }
        else if(fruit.equals("orange")){
            System.out.println("Round fruit");
        }
        else if(fruit.equals("grapes")){
            System.out.println("Small Fruit");
        }
        else{
            System.out.println("Fruit Not Listed");
        }
*/
        switch(fruit){
            case "mango":
                System.out.println("The King of Fruits");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "orange":
                System.out.println("Round Fruit");
                break;
            case "grapes":
                System.out.println("Small Fruit");
                break;
            default:
                System.out.println("Fruit Not Listed");
        }
    }
}
