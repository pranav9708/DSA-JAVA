// Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:

// Input: nums = [2,2,3,2]
// Output: 3


//Approach 1 TC-O(n^2) SC-O(1)
// class Solution {
//     public int singleNumber(int[] nums) {

//         int single=-1;
//         for(int i=0;i<nums.length;i++){
//             int count=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j])
//                     count++;
//             }
//             if(count==1){
//                 single=nums[i];
//                 break;
//             }
//         }
//         return single;
//     }
// }

//Approach 2 TC-O(n), SC-O(1)
class Solution {
    public int singleNumber(int[] nums) {
       int single=0;

       //iterating till 32 because int value is stored in 32 bit
       for(int i=0;i<32;i++){
           int sum=0;
           //for each set bit of every element we check if the occurrence is 3 or more
           //if it is more than 3 it means the additional one is because of the duplicate element
           //for eg.[2,2,2,1]. each element in 32 bit-[10,10,10,01].here first bit count is 3 which gets 
           //turned to 0 and second bit count is 1 i.e 1 is the duplicate element
           for(int j=0;j<nums.length;j++){
               if(((nums[j]>>i)&1)==1){
                   sum++;
                   sum=sum%3;
               }
           }
           //additional the additional bit to appropriate position using i
           if(sum!=0){
               single|=sum<<i;
           }
       }

       return single;
    }
}