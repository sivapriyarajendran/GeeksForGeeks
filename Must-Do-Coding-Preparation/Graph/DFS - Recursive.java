//User function Template for Java
/*
*ArrayList<ArrayList<Integer>> list: which represents graph
* src: represents source vertex
*vis[]: boolean array 
*/
class Traversal
{
    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean visited[])
    {
        visited[src] = true; 
        System.out.print(src+" "); 
        Iterator<Integer> i = list.get(src).listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                dfs(n, list, visited); 
        } 
    }
}
