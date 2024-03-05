class Solution {
    public int countPrimes(int n) {
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=1;
        }
        for(int i=2;i<n;i++){
            if(arr1[i]==1)
            {
                for(int j=i*2;j<n;j=j+i){
                    arr1[j]=0;
                }
            }
        }
        int count=0;
        for(int k=2;k<n;k++){
            if(arr1[k]==1){
                count++;
            }
        }
        return count;
    }
}