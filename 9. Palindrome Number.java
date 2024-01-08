class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int digit=0,sum=0;
        while(temp>0){
            digit=temp%10;
            sum=sum*10+digit;
            temp/=10;
        }
        if(x==sum){
            return true;
        }
        else
        {
            return false;
        }

    }
}