class Solution {
    public int strStr(String h, String n) {
        int l1=h.length();
        int l2=n.length();
        if(l1<l2) return -1;
        for(int i=0;i<=l1-l2;i++){
            int temp=i;
            for(int j=0;j<l2;j++){
                if(h.charAt(temp)!=n.charAt(j)) break;
                temp++;
                if(j==l2-1){
                    return i;
                }
            }
        }
        return -1;
    }
}