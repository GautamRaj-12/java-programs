package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);

        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length+ second.length];
        int i=0,j=0,k=0;
        while(i< first.length&&j< second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //It may be possible that one of the arrays is not complete
        //Copy the remaining elements
        while(i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(i< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;

    }
}
