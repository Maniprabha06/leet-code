class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack=new Stack<Integer>();
        int n=t.length;
        int[] res=new int[n];
        int cur=0,flag=0;
        for(int i=0;i<n;i++){
            int next=i;
            if(stack.isEmpty()){
                stack.push(next);
            }
            else{
                while(!stack.isEmpty()&& t[next]>t[stack.peek()]){
                    res[stack.peek()]=next-stack.pop();
                }
                stack.push(next);
            }
        }
        while(!stack.isEmpty()){
            res[stack.pop()]=0;
        }
        return res;
    }
}













