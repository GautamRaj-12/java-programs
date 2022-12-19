package Functions;

import java.util.Scanner;

public class SwapNumbersTry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number (a): ");
        int a = in.nextInt();
        System.out.println("Enter a number (b): ");
        int b = in.nextInt();

        System.out.println("Numbers before swapping: "+"a: "+a+" b: "+b);

        swap(a,b);
        System.out.println("Numbers after swapping inside main function: "+"a: "+a+" b: "+b);
    }
    static void swap(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after swapping inside swap function: "+"a: "+a+" b: "+b);
    }
}
