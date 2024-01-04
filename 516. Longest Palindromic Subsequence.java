class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        String s1=null;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            s1=c+s1;
        }
        return lps(n,n,s,s1,dp);
    }
    public static int lps(int m,int n,String text1,String text2,int[][] dp){
        if(m==0 || n==0)
            return 0;
        if(text1.charAt(m-1)==text2.charAt(n-1))
            return 1+lps(m-1,n-1,text1,text2,dp);
        int a,b;
        if(dp[m-1][n]!=-1)
            a=dp[m-1][n];
        else
            a=lps(m-1,n,text1,text2,dp);
            dp[m-1][n]=a;
        if(dp[m][n-1]!=-1)
            b=dp[m][n-1];
        else
            b=lps(m,n-1,text1,text2,dp);
            dp[m][n-1]=b;
        return Math.max(a,b);
    }
}