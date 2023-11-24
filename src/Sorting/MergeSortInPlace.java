package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int s,int e){
        if(e-s==1){
            return;
        }
        int mid = s + (e - s) / 2;

        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        merge(arr,s,mid,e);
    }
    static void merge(int[] arr,int s, int mid, int e){
        int[] mix = new int[e-s];
        int i=s,j=mid,k=0;
        while(i< mid && j<e ){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        //It may be possible that one of the arrays is not complete
        //Copy the remaining elements
        while(i< mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        // Copy the merged array back to the original array
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }

    }
}
