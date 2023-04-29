// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000

//Approach 1 TC-O(logn) SC-O(logn)
class Solution {
    public double myPow(double x, int n) {
        
        //to avoid stack overflow error
        if(x<-10000||x>10000){
            return 0;
        }
        if(n==0){
            return 1;
        }

        if(n<0){
            n=-n;
            x=1/x;
        }

        if((n&1)==0){
            return myPow(x*x,n/2);
        }else{
            return x*myPow(x,n-1);
        }
    }
}