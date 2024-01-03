class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> temp=new ArrayList<>();
        int rowstart=0;
        int colend=n-1;
        int rowend=m-1;
        int colstart=0;
        int d=0;
        while(rowstart<=rowend && colstart <= colend){
            if(d==0){
                for(int i=colstart;i<=colend;i++){
                    temp.add(matrix[rowstart][i]);
                }
                rowstart++;
                d=1;
            }
            else if(d==1){
                for(int i=rowstart;i<=rowend;i++){
                    temp.add(matrix[i][colend]);
                }
                colend--;
                d=2;
            }
            else if(d==2){
                for(int i=colend;i>=colstart;i--){
                    temp.add(matrix[rowend][i]);
                }
                rowend--;
                d=3;
            }
            else{
                for(int i=rowend;i>=rowstart;i--){
                    temp.add(matrix[i][colstart]);
                }
                colstart++;
                d=0;
            }
        }
        return temp;
    }
}
