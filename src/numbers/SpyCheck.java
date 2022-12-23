package numbers;

import java.util.Scanner;

public class SpyCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****SPY NUMBER CHECK*****");

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int originalNum = n;
        int sod=0,pod=1;

        while(n>0){
            int rem = n%10;
            sod = sod+rem;
            pod = pod*rem;
            n = n/10;
        }
        if(sod==pod){
            System.out.println(originalNum+" is a spy number");
        }
        else{
            System.out.println(originalNum+" is not a spy number");
        }
    }
}
