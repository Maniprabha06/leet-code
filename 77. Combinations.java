class Solution {
    public void solve(int n,List<List<Integer>> res,List<Integer> sub,int k,int index){
        if(sub.size()==k){
            res.add(new ArrayList<>(sub));
            return ;
        }
        for(int i=index;i<n;i++){
                sub.add(i+1);
                solve(n,res,sub,k,i+1);
                sub.remove(sub.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        solve(n,res,sub,k,0);
        return res;
    }
}