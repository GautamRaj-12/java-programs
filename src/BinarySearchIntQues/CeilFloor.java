package BinarySearchIntQues;

import java.util.Arrays;
import java.util.Scanner;

public class CeilFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements you want in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter a sorted array: ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value whose ceiling and floor to be found: ");
        int x = sc.nextInt();
        System.out.println("Provided array: "+ Arrays.toString(arr));
        ceilFloor(n,x,arr);
    }
    static void ceilFloor(int n,int x, int[] arr){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==x){
                System.out.println("Floor: "+x+" Ceiling: "+x);
                break;
            }
            else if(arr[mid]>x){
                end = mid-1;
            }
            else if(arr[mid]<x){
                start = mid+1;
            }
        }
        if(start>end){
            System.out.println("Floor: "+arr[end]+" Ceiling: "+arr[start]);
        }
    }
}
