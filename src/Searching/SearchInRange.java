package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want in your array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array provided: "+ Arrays.toString(arr));

        System.out.println("Enter the number you want to search: ");
        int target = sc.nextInt();

        System.out.println("Enter the starting and ending index between which you want the character to search: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        linearSearch(arr,target,start,end);
    }
    static void linearSearch(int[] arr,int target,int start,int end){
        int i;
        for(i=start;i<=end;i++) {
            if (arr[i] == target) {
                System.out.println("The element is found at the index " + i);
                break;
            }
        }
        if(i>end){
            System.out.println("The target element is not present in the array");
        }
    }
}
