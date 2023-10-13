class Solution {
    public void rotate(int[][] matrix) {
       int len=matrix.length;
       // transpose
       for(int i=0;i<len;i++)
       {
           for(int j=i;j<len;j++)
           {
               if(i!=j)
               {
                   int temp=matrix[i][j];
                   matrix[i][j]=matrix[j][i];
                   matrix[j][i]=temp;
               }
           }
       }
       //reverse 
    for(int i=0;i<len;i++)
    {
        for(int start=0,end=len-1;start<end;start++,end--)
        {
            int temp=matrix[i][start];
            matrix[i][start]=matrix[i][end];
            matrix[i][end]=temp;
        }
    }
    }
}