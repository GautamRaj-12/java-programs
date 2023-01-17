package ArrayPrograms;

public class MaxEdgeCase {
    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50,60,70};
        max(arr);
        maxRange(arr,2,5);
    }
    static void max(int[] arr){
        if(arr.length==0){
            System.out.println("Array is empty");
            System.exit(-1);
        }
        int max=arr[0];
        for(int index=1;index<arr.length;index++){
            if(arr[index]>max){
                max = arr[index];
            }
        }
        System.out.println("The maximum number in the array is: "+max);
    }

    static void maxRange(int[] arr, int start, int end){
        if(arr.length==0){
            System.out.println("Array is empty");
            System.exit(0);
        }
        if(end<start){
            System.out.println("Ending index is less than starting index");
            System.exit(0);
        }
        int max=arr[start];
        for(int index=start;index<=end;index++){
            if(arr[index]>max){
                max = arr[index];
            }
        }
        System.out.println("The maximum number in the array is: "+max);
    }

}
