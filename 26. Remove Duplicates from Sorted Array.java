class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        for(j=0;j<n;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}