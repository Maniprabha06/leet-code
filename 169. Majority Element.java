class Solution {
    public int majorityElement(int[] nums) {
        //voting technique ->counting
        int ans=-1,vote=0;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
             if(vote!=0)
            {
                if(ans==nums[i])
                {
                    vote+=1;
                }
                else
                {
                    vote-=1;
                }
            }
            else if(vote==0)
            {       
                if(ans!=nums[i])
                {
                    ans=nums[i];
                    vote+=1;
                }
                else{
                    vote+=1;
                }
            }
        }
        return ans;
    }
}