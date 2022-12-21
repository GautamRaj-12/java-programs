package numbers;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reversed = 0;
        System.out.println("*****REVERSE THE NUMBER*****");
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int temp = num;

        while(temp>0){
            int rem = temp%10;
            reversed=reversed*10+rem;
            temp=temp/10;
        }
        if(reversed==num){
            System.out.println(num+" is a palindrome number");
        }
        else{
            System.out.println(num+" is not a palindrome number");
        }
    }
}
