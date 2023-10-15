// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Arrays.sort(nums);
//         find(nums, nums.length, 0, ans);
//         return ans;
//     }
//         public static void find(int[] arr, int n, int ind, List<List<Integer>> ans){
//         if(ind == n){
//             List<Integer> ds = new ArrayList<>();
//             for(int it : arr){
//                 ds.add(it);
//             }
//             ans.add(ds);
//             return;
//         }
//         for(int i=ind; i<n;i++){
//             swap(arr, i, ind);
//             find(arr, n, ind+1, ans);
//             swap(arr, i, ind);
//         }
//     }
//     public static void swap(int[] arr, int si, int ei){
//         int t = arr[si];
//         arr[si] = arr[ei];
//         arr[ei] = t;
//     }
// }
class Solution{
    public static void solve(int[] nums,List<Integer> sub,List<List<Integer>> res,boolean[] start)
    {
        int len=nums.length;
        if(sub.size()==len)
        {
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i=0;i<len;i++)
        {
            if(start[i]==true)continue;
            else{
                start[i]=true;
                sub.add(nums[i]);
                solve(nums,sub,res,start);
                start[i]=false;
                sub.remove(sub.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        boolean[] start=new boolean[nums.length];
        solve(nums,sub,res,start);
        return res;
    }
}
