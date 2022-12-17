package Functions;

import java.util.Scanner;

public class SumFunctionReturn {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("The sum is: "+ans);
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter a number:");
        num1 = in.nextInt();

        System.out.println("Enter another number: ");
        num2 = in.nextInt();

        sum = num1+num2;

        return sum;
    }
}
