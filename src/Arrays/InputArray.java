package Arrays;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        int[] marks = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array elements: ");

        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("The array entered is: ");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
