class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        else if(n==2) return "11";
        String ref="11";
        for(int i=3;i<=n;i++){
            String temp="";
            int m=ref.length();
            int count=1;
            for(int j=0;j<m-1;j++){
                if(ref.charAt(j)==ref.charAt(j+1)) count++;
                else{
                    temp=temp+String.valueOf(count);
                    temp=temp+ref.charAt(j);
                    count=1;
                }
            }
            temp=temp+String.valueOf(count)+ref.charAt(m-1);
            ref=temp;
        }
        return ref;
    }
}