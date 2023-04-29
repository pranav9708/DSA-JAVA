// Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

// You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

// Example 1:

// Input: nums = [1,2,1,3,2,5]
// Output: [3,5]
// Explanation:  [5, 3] is also a valid answer.


//Approach 1 TC-O(nlogn), SC-O(1)
// class Solution {
//     public int[] singleNumber(int[] nums) {
//         int result[]=new int[2];
//         Arrays.sort(nums);
//         for(int i=0,k=0;i<nums.length-1;i++){
//             if(nums[i]==nums[i+1]){
//                 i++;
//             }else{
//                 result[k]=nums[i];
//                 k++;
//             }
//         }
//         if(nums[nums.length-2]!=nums[nums.length-1]){
//             result[1]=nums[nums.length-1];
//         }
//         return result;
//     }
// }

//Approach 2 TC-O(n), SC-0(1)
class Solution {
    public int[] singleNumber(int[] nums) {
        int ab=0;

        for(int i=0;i<nums.length;i++){
            ab=ab^nums[i];
        }

        int rightSetBit=ab&~(ab-1);
        int num1=0;
        int num2=0;

        for(int num:nums){
            if((num & rightSetBit)>0){
                num1^=num;
            }else{
                num2^=num;
            }
        }

        return new int[]{num1,num2};
    }
}