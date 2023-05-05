// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

class Solution {

    //Bruteforce
    // public int majorityElement(int[] nums) {
    //     if(nums.length==0){
    //         return 0;
    //     }
    //     int maxCount=0;
    //     int ans=-1;
    //     for(int i=0;i<nums.length;i++){
    //         int count=0;
    //         for(int j=0;j<nums.length;j++){
    //             if(nums[i]==nums[j]){
    //                 count++;
    //             }
    //         }
    //         if(count>maxCount){
    //             maxCount=count;
    //             ans=nums[i];
    //         }
    //     }
    //     return ans;   
    // }

    //using space optimization
    // public int majorityElement(int[] nums) {
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     int ret=0;
    //     for(int num:nums){
    //         if(!map.containsKey(num)){
    //             map.put(num,1);
    //         }else{
    //             map.put(num,map.get(num)+1);
    //         }

    //         if(map.get(num)>nums.length/2){
    //             ret=num;
    //             break;
    //         }
    //     }

    //     return ret;
    // }

    //optimal solution
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int maxCount=1;
        int ans=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count>maxCount){
                maxCount=count;
                ans=nums[i];
            }
        }
        return ans;   
    }
}