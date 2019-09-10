class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
       
        // add your code here
        boolean visited[] = new boolean[V];
        
        for(int i=0;i<V;i++){
            visited[i]=false;
        }
        
        for(int i=0;i<V;i++){
            if(!visited[i])
            if(isCycleUtil(i,visited,list,-1)){
                return true;
            }
        }
        return false;
    }
    
     public static boolean isCycleUtil(int v, boolean[] visited, ArrayList<ArrayList<Integer>> list, int parent){
    
        visited[v]=true;
        
        ArrayList<Integer> temp = list.get(v);
        for(int i =0;i<temp.size();i++){
            int j=temp.get(i);
            if(!visited[j]){
                
                if(isCycleUtil(j, visited, list, v)){
                    return true;
                }
            }
            else if(j!=parent){
                return true;
            }
        }
        return false;
    }
}
