class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int msf=nums[0];
        int meh=0;
        for(int i=0;i<n;i++)
        {
            meh+=nums[i];
            if(msf<meh)
            {
                msf=meh;
            }
            if(meh<0)
            {
                meh=0;
            }

        }
        return msf;
    }
}
