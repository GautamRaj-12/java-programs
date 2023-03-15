package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAgnostic {
    public static void main(String[] args) {
        int[] arr = {-18,-16,0,1,2,23,34,56,78};
//        int[] arr = {88,54,35,23,11,0,-1,-4,-5};
        System.out.println("The provided array is: "+ Arrays.toString(arr));
        System.out.println("Enter the value to be searched: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        binarySearch(arr,target);
    }
    static void binarySearch(int arr[],int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                System.out.println("Element is found at index "+mid);
                break;
            }
            if(arr[start]>arr[end]){
                if(arr[mid]>target){
                    start = mid+1;
                }
                else if(arr[mid]<target){
                    end = mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    end = mid-1;
                }
                else if(arr[mid]<target){
                    start = mid+1;
                }
            }
            if(start>end){
                System.out.println("Element is not present in the array.");
            }
        }

    }
}
