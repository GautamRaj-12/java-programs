package Functions;

import java.util.Scanner;

public class FirstFunction {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2;

        System.out.println("Enter a number: ");
        num1 = in.nextInt();

        System.out.println("Enter another number");
        num2 = in.nextInt();

        int sum = num1+num2;

        System.out.println("The sum is: "+sum);
    }
}
