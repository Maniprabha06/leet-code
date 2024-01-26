class Solution {
    int count=0;
    public boolean issafe(int n,int[][] board,int a,int b){
        for(int j=0;j<=b;j++){
            if(board[a][j]==1){
                return false;
            }
        }
        for(int i=0;i<=a;i++){
            if(board[i][b]==1){
                return false;
            }
        }
        for(int i=a-1,j=b-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int i=a,j=b;i>=0&&j<n;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public void solve(int n,int[][] board,int i){
        if(i==n){
            count++;
            return ;
        }
        for(int k=0;k<n;k++){
            if(issafe(n,board,i,k)){
                board[i][k]=1;
                solve(n,board,i+1);
                board[i][k]=0;
            }
        }
    } 
    public int totalNQueens(int n) {
        int[][] board=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            board[i][j]=0;
            }
        }
        int i=0;
        solve(n,board,i);
        return count;
    }
}