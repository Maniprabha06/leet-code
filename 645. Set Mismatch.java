class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        int n=nums.length;
        int sum=0;
        HashSet<Integer> h=new HashSet<>();
        for(int num:nums){
            if(h.contains(num)){
                ans[0]=num;
            }
            else{
                h.add(num);
                sum+=num;
            }
        }
        ans[1]=((n*(n+1))/2)-(sum);
        return ans;
    }
}