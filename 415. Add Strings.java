class Solution {
    public String addStrings(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
        int carry=0,a=0,i=0,j=0;
        String ans="";
        for(i=n-1,j=m-1;i>=0 && j>=0;i--,j--){
                a=num1.charAt(i)-'0'+num2.charAt(j)-'0'+carry;
                if(a>9){
                    carry=1;
                    a=a%10;
                }
                else{
                    carry=0;
                }
            ans=Integer.toString(a)+ans;
        }
            if(i>=0){
                while(i>=0){
                    a=num1.charAt(i)-'0'+carry;
                    if(a>9){
                    carry=1;
                    a=a%10;
                }
                else{
                    carry=0;
                }
                ans=Integer.toString(a)+ans;
                i--;
                }
            }
            if(j>=0){
                while(j>=0){
                    a=num2.charAt(j)-'0'+ carry;
                    if(a>9){
                    carry=1;
                    a=a%10;
                }
                else{
                    carry=0;
                }
        ans=Integer.toString(a)+ans;
        j--;
        }
    }
        if(carry==1){
            ans="1"+ans;
        }
        return ans;
    }
}