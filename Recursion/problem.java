// There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

// Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

// The test cases are generated so that the answer will be less than or equal to 2 * 109.

//Approach 1 TC-O(m*n) 
class Solution {

    public int solve(int m,int n,int dp[][]){
        if(m==1||n==1){
            return 1;
        }

        if(dp[m][n]>0){
            return dp[m][n];
        }

        dp[m-1][n]=solve(m-1,n,dp);
        dp[m][n-1]=solve(m,n-1,dp);
        return dp[m-1][n]+dp[m][n-1];
    }

    public int uniquePaths(int m, int n) {

        int dp[][]=new int [m+1][n+1];
        return solve(m,n,dp); 
    }
}