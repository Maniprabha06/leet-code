class Solution {
    public int partitionString(String s) {
        int res=0;
        int i=0;
        while(i<s.length()){
            res++;
            int[] count=new int[26];
            while(i<s.length()){
                if(count[s.charAt(i)-'a']>0) break;
                   count[s.charAt(i)-'a']++;
                   i++;
            }
        }
        return res;
    }
}