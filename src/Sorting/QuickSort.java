package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,6,7,81,2,3,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int p = e-1;

        while(s<=e){
            while(nums[s]<p){
                s++;
            }
            while(nums[e]>p){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
    //now my pivot is at current index, please sort two halves now
        sort(nums,low,e);
        sort(nums,s,high);
    }
}
