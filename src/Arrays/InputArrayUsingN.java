package Arrays;

import java.util.Scanner;

public class InputArrayUsingN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered array elements: ");
        for(int a:arr){
            System.out.println(a);
        }
    }
}
