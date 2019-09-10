/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below*/
/*
ArrayList<ArrayList<Integer>> list: to represent graph containing 'v'
                                    vertices and edges between them
V: represent number of vertices
*/
class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> list, int V)
    {
        // add your code here
        boolean visited[] = new boolean[V];
        boolean recstack[] = new boolean[V];
        
        for(int i=0;i<V;i++){
            visited[i]=false;
            recstack[i]=false;
        }
        
        for(int i=0;i<V;i++){
            if(isCycleUtil(i,visited,recstack,list)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isCycleUtil(int v, boolean[] visited, boolean[] recstack, ArrayList<ArrayList<Integer>> list){
        if(recstack[v])return true;
        if(visited[v])return false;
        visited[v]=true;
        recstack[v]=true;
        ArrayList<Integer> temp = list.get(v);
        // Iterator i = temp.listIterator();
        // Integer node=0;
        for(int i =0;i<temp.size();i++){
            // Integer node= i.next();
            if(isCycleUtil(temp.get(i), visited, recstack,list)){
                return true;
            }
        }
        recstack[v]=false;
        return false;
    }
}
