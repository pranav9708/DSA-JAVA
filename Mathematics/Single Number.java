// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:

// Input: nums = [2,2,1]
// Output: 1

//Approach 1 TC-O(n^2) SC-O(1)
// class Solution {
//     public int singleNumber(int[] nums) {
//        int single=-1;
//        for(int i=0;i<nums.length;i++){
//            int found=0;
//            for(int j=0;j<nums.length;j++){
//                if(nums[i]==nums[j]){
//                    found++;
//                }
//            }
//            if(found==1){
//                single=nums[i];
//                break;
//            }
//        }
//        return single;
//     }
// }


//Approach 2 TC-O(nlogn) SC-O(1)
// class Solution {
//     public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        int single=nums[nums.length-1];

//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i]!=nums[i+1]){
//                single=nums[i];
//                break;
//            }else{
//                i++;
//            }
//        }
//        return single;
//     }
// }

//Approach 3 TC-O(n) SC-O(1)
class Solution {
    public int singleNumber(int[] nums) {
       int single=0;
       for (int num:nums){
           single^=num;
       } 
       return single;
    }
}