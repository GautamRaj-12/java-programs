package conditionals;

import java.util.Scanner;

public class IfElseNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Enter rating: ");
            int rating = sc.nextInt();

            if(rating>5){
                System.out.println("Eligible to play ranked match");
            }
            else{
                System.out.println("Not Eligible to play ranked match");
            }
        }
        else{
            System.out.println("Not eligible to play game");
        }

    }
}
