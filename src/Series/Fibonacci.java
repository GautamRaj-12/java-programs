package Series;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****FIBONACCI SERIES PRINT*****");
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print(firstTerm+","+secondTerm);

        for(int i=2;i<n;i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print("," + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
