class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        Queue<Integer> q1=new LinkedList<>();
        int res=0;
        for(int i=0;i<n;i++){
            q1.add(i); //q1.offer(i); --> index in queue
        }
        while(!q1.isEmpty()){
            int f = q1.poll(); //-->front of the queue
            tickets[f]--;
            res++;
            if(tickets[f]>0){
                q1.add(f);
            }
            if(f==k && tickets[k]==0){
                return res;
            }
        }
        return res;
    }
}
