package conditionals;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number>0) {
            System.out.println("Positive number");
        }
        System.out.println("This is the code after If block");
    }
}
