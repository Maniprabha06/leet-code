class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                int temp=nums[i];
                nums[i]=nums[flag];
                nums[flag]=temp;
                flag++;
            }
        }
        return nums;
    }
}
