package Functions;

import java.util.Scanner;

public class SumFunctionParameterReturn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans=sum(a,b);
        System.out.println("The answer is: "+ans);
    }
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
