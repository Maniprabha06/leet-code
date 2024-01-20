class Solution {
    public int minSwapsCouples(int[] row) {
        int n=row.length;
        int count=0;
        int pat=0;
        for(int i=0;i<n-1;i=i+2){
            if(row[i]%2==0){
                 pat=row[i]+1;
            }else{
                pat=row[i]-1;
            }
            if(pat!=row[i+1]){
                count++;
            for(int j=i;j<n;j++){
                if(row[j]==pat){
                    int temp=row[j];
                    row[j]=row[i+1];
                    row[i+1]=temp;
                    break;
                }
            }
            }  
        }
        return count;
    }
}                                                                                                                                                                                                                                                            