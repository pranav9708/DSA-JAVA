// Given an integer array nums, find the 
// subarray
//  with the largest sum, and return its sum.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

class Solution {
    //bruteforce
    // public int maxSubArray(int[] nums) {
    //     int maxSum=Integer.MIN_VALUE;

    //     for(int i=0;i<nums.length;i++){
    //         int sum=0;
    //         for(int j=i;j<nums.length;j++){
    //             sum+=nums[j];
    //             maxSum=Math.max(sum,maxSum);
    //         }
    //     }

    //     return maxSum;
    // }
    
    //optimized
    public int maxSubArray(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<nums.length;i++){
            current+=nums[i];

            if(largest<current){
                largest=current;
            }

            if(current<0){
                current=0;
            }
        }
        
        return largest;
    }
}