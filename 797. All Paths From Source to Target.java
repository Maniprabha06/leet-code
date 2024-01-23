class Solution {
    public void dfs(int[][] graph,List<List<Integer>> path,List<Integer> sub,int i,int n){
        sub.add(i);
        if(i==n){
            path.add(new ArrayList<>(sub));
            return ;
        }
        for(int j=0;j<graph[i].length;j++){
            dfs(graph,path,sub,graph[i][j],n);
            sub.remove(sub.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> path=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        int n=graph.length-1;
        dfs(graph,path,sub,0,n);
        return path;
    }
}
