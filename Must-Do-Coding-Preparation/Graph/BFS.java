/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
*ArrayList<ArrayList<Integer>> list: represent graph containing vertices
                                    and edges between them
*vis[]: boolean array to represent visited vertex
*s: starting vertex 
*/
class Traversal
{
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[], int nov)
    {
       // add your code here
       LinkedList<Integer> queue = new LinkedList<Integer>();
       vis[s]=true;
       queue.add(s);
       while(queue.size() != 0){
           int temp = queue.poll();
           System.out.print(temp+" ");
           Iterator<Integer> i = list.get(temp).listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!vis[n]) 
                { 
                    vis[n] = true; 
                    queue.add(n); 
                } 
            } 
       }
    }
}
