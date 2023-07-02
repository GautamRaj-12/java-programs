package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {10,25,31,23,4,8,95};
        System.out.println(search(arr,0,arr.length-1,8));
    }
    static int search(int[] arr,int s,int e,int target){
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
        }
}

