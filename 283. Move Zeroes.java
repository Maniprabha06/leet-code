class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0,i=0;
        for(int num:nums){
            if(num!=0){
                nums[i]=num;
                i++;
            }
        }
        while(i<n){
            nums[i]=0;
            i++;
        }
    }
}