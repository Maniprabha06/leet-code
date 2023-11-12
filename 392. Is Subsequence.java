class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int l=t.length();
        int k=0,flag=0;
        for(int i=0;i<n;i++){
            flag=0;
            for(int j=k;j<l;j++){
                if(s.charAt(i)==t.charAt(j)){
                    flag=1;
                    k=j+1;
                    break;
                }
            }
        if(flag==0){
            return false;
        }
    }
        return true;
    }
}
