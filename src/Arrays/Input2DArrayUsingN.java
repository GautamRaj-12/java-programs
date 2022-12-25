package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input2DArrayUsingN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter "+(row*col)+" elements: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered 2D Array is: ");
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
