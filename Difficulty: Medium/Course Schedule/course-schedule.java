class Solution {
    public static ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // code here
        ArrayList<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:prerequisites){
            adj.get(e[1]).add(e[0]);
        }
        
        int[] indegree = new int[n];
        for(int u=0;u<n;u++){
            for(int v:adj.get(u)){
                indegree[v]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> t = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            t.add(node);
            for(int ne:adj.get(node)){
                indegree[ne]--;
                if(indegree[ne]==0){
                    q.add(ne);
                }
            }
        }
        if(t.size()==n){
            return t;
        }else{
            return new ArrayList<>();
        }
    }
}