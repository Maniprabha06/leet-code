class Solution {
    public static void solve(int[] nums,List<Integer> sub,List<List<Integer>> res,boolean[] state){
        int n=nums.length;

        if(sub.size()==n){
            res.add(new ArrayList<>(sub));
            return;
        }
        if(state[0]==false){
            state[0]=true;
            sub.add(nums[0]);
            solve(nums,sub,res,state);
            state[0]=false;
            sub.remove(sub.size()-1);
        }
        for(int i=1;i<n;i++){
            if(state[i]==false && nums[i]!=nums[i-1]){
                state[i]=true;
                sub.add(nums[i]);
                solve(nums,sub,res,state);
                state[i]=false;
                sub.remove(sub.size()-1);
            }
            else if(state[i]==false && nums[i]==nums[i-1] && state[i-1]==true){
                state[i]=true;
                sub.add(nums[i]);
                solve(nums,sub,res,state);
                state[i]=false;
                sub.remove(sub.size()-1);
            }
        }

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        boolean[] state=new boolean[n];
        solve(nums,sub,res,state);
        return res;
    }
}