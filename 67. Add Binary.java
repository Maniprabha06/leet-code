class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        String res="";
        int carry=0;
        while(i>=0 || j>=0){
            int c1=0,c2=0,sum=0;
            if(i>=0){
                c1=(int)a.charAt(i--)-'0';
            }
            if(j>=0){
                c2=(int)b.charAt(j--)-'0';
            }
            sum=carry+c1+c2;
            if(sum>1){
                carry=1;
                if(sum==2) res='0'+res;
                else res='1'+res;
            }
            else{
                carry=0;
                if(sum==1) res='1'+res;
                else res='0'+res;
            }
        }
        if(carry!=0) res='1'+res;
        return res;
    }
}