package Recursion;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number whose factorial to be found: ");
        int a = sc.nextInt();
        int f = fact(a);
        System.out.println("The factorial is: "+f);
    }
    static int fact(int n){
        if(n>=1){
           return n*fact(n-1);
        }
        else{
            return 1;
        }
    }
}
