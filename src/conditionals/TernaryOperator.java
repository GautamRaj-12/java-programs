package conditionals;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        System.out.println((number>0)?"Positive Number":"Negative Number");

    /*
        String result = (number>0)?"Positive Number":"Negative Number";
        System.out.println(result);
    */
    }
}
