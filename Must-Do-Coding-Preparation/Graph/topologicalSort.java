class TopologicalSort
{
    static int[] topoSort(ArrayList<ArrayList<Integer>> list, int N)
    {
       // add your code here
       Stack<Integer> stack = new Stack<Integer>(); 
        int arr[] = new int[N]; 
        boolean visited[] = new boolean[N]; 
        for (int i = 0; i < N; i++) 
            visited[i] = false; 
        for (int i = 0; i < N; i++) 
            if (visited[i] == false) 
                topologicalSortUtil(i, visited, list, stack); 
  
        int i=0;
        while (i<N) {
            arr[i] = stack.pop();
            System.out.print(arr[i] + " ");
            i++;
        }
        return arr;
    }
    
    public static void topologicalSortUtil(int v, boolean visited[], ArrayList<ArrayList<Integer>> list, 
                                Stack<Integer> stack) 
{ 
    visited[v] = true; 
    Iterator<Integer> i = list.get(v).listIterator(); 
    while(i.hasNext()) {
        int temp = i.next();
        if (!visited[temp]) 
            topologicalSortUtil(temp, visited, list, stack); 
    }
    stack.push(v); 
    } 
}
