class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void solve(List<Integer> sub,int[] cand,int i,int target){
        if(i==cand.length) return ;
        if(target==0){
            res.add(new ArrayList<>(sub));
            return ;
        }
        if(cand[i]<=target){
            sub.add(cand[i]);
            solve(sub,cand,i,target-cand[i]);
            sub.remove(sub.size()-1);
            solve(sub,cand,i+1,target);
        }
        else{
            solve(sub,cand,i+1,target);
        }
    }
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<Integer> sub=new ArrayList<>();
        solve(sub,cand,0,target);
        return res;
    }
}