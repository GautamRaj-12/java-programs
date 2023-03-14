package Searching;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
        int count=0;

        for (int num:nums) {
            if(even(num))
                count++;
        }
        return count;
    }
    static boolean even(int num){
        int noOfDigits=0;
        while (num>0) {
            noOfDigits++;
            num = num/10;
        }
        return noOfDigits%2==0;
    }
    //shortcut way of counting the digits
//    static int digits(int num){
//        return (int)(Math.log10(num))+1;
//    }
}

