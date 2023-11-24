package BinarySearchIntQues;
//Leetcode 34
public class searchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,88,10};
        int target = 11;

        searchRange(nums,target);
    }
    static int[] searchRange(int[]nums, int target){
        int[] ans = {-1,-1};
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){

            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}
