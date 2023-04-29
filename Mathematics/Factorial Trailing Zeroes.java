// Given an integer n, return the number of trailing zeroes in n!.

// Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

// Example 1:

// Input: n = 3
// Output: 0
// Explanation: 3! = 6, no trailing zero.


//Approach 1 TC-O(log_5(n)) SC-O(1)
// class Solution {
//     public int trailingZeroes(int n) {
//         int res=0;
//         for(int i=5;i<=n;i*=5){
//             res=res+n/i;
//         }
//         return res;
//     }
// }
//Same approach as above one is increase i tll n other is decreasing n till it reaches 0
class Solution {
    public int trailingZeroes(int n) {
        int r = 0;
        while (n > 0) {
            n /= 5;
            r += n;
        }
        return r;
    }
}