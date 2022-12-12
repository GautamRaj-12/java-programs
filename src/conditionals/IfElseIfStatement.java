package conditionals;

import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number>0) {
            System.out.println("Positive Number");
        }
        else if(number==0){
            System.out.println("ZERO");
        }
        else{
            System.out.println("Negative Number");
        }
        System.out.println("This is the code after If block");
    }
}
