class Solution {
    public int solve(int amount,int[] coins,int i,int[][] dp){
        if(amount==0){
            return 1;
        }
        if(amount<0 || i==coins.length){
            return 0;
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        if(coins[i]<=amount){
            dp[i][amount]=solve(amount-coins[i],coins,i,dp)+solve(amount,coins,i+1,dp);
            return dp[i][amount];
        }
        dp[i][amount]=solve(amount,coins,i+1,dp);
        return dp[i][amount];
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<amount+1;j++){
                    dp[i][j]=-1;
                }
            }
        return solve(amount,coins,0,dp);
    }
}
