package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][2];

        //INPUT
        System.out.println("Enter 6 elements");
        for(int row=0;row<arr.length;row++){
            //for every col in each row
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //OUTPUT USING NESTED FOR LOOPS
        System.out.println("Entered array is(Printed using nested for loops): ");
        for(int row=0;row<arr.length;row++){
            //for every col in each row
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        //OUTPUT USING toString() method
        System.out.println("Entered array is(Printed using toString() method): ");
        for(int row=0;row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        //OUTPUT USING enhanced For Loop
        System.out.println("Entered array is(Printed using enhanced for loop): ");
        //each array inside the array
        for(int[] innerArray : arr){
            //each element inside the row
            for(int a:innerArray){
                System.out.print(a+" ");
            }
            System.out.println();
        }

        //OUTPUT USING enhanced For Loop and toString()
        System.out.println("Entered array is(Printed using enhanced for loop and toString()): ");
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
