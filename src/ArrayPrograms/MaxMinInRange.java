package ArrayPrograms;

public class MaxMinInRange {
    public static void main(String[] args) {
        int[] arr ={10,20,15,14,56,78,89,65};
        maxRange(arr,2,5);
        minRange(arr,2,5);
    }
    static void maxRange(int[] arr, int start, int end){
        int max=arr[start];
        for(int index=start;index<=end;index++){
            if(arr[index]>max){
                max = arr[index];
            }
        }
        System.out.println("The maximum number in the array is: "+max);
    }
    static void minRange(int[] arr,int start,int end){
        int min=arr[start];
        for(int index=start;index<=end;index++){
            if(arr[index]<min){
                min = arr[index];
            }
        }
        System.out.println("The minimum number in the array is: "+min);
    }
}
