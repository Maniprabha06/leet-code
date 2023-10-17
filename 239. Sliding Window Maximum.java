class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<Integer>();  
        int n=nums.length;
        int[] res=new int[n-k+1];
        int r=0;
        for(int i=0;i<n;i++){
            //bound of the window
            while(!q.isEmpty() && q.peek()<i-k+1){
                q.poll();
            }
            //check for any usless values
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                res[r++]=nums[q.peek()];
            }
        }
        return res;
    }
}