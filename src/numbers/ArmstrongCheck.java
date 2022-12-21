package numbers;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*****ARMSTRONG NUMBER CHECKING*****");
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        double sum=0;
        int temp = num;
        while(temp>0){
            int rem = temp%10;
            sum = sum+Math.pow(rem,3);
            temp=temp/10;
        }
        if(sum==num){
            System.out.println(num+" is an armstrong number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}