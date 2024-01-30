class Solution {
    public int trailingZeroes(int num) {
        int den=5;
        int ans=0;
        while(num>=den){
            ans=ans+num/den;
            den=den*5;
        }
        return ans;
    }
}