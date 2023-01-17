package ArrayPrograms;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr ={10,20,15,14,56,78,89,65};
        max(arr);
        min(arr);
    }
    static void max(int[] arr){
        int max=arr[0];
        for(int index=1;index<arr.length;index++){
            if(arr[index]>max){
                max = arr[index];
            }
        }
        System.out.println("The maximum number in the array is: "+max);
    }
    static void min(int[] arr){
        int min=arr[0];
        for(int index=1;index<arr.length;index++){
            if(arr[index]<min){
                min = arr[index];
            }
        }
        System.out.println("The minimum number in the array is: "+min);
    }
}
