package numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reversed = 0;
        System.out.println("*****REVERSE THE NUMBER*****");
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        while(num>0){
            int rem = num%10;
            reversed=reversed*10+rem;
            num=num/10;
        }
        System.out.println("Reversed number: "+reversed);
    }
}
