/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Islands
{
    
        static boolean isSafe(ArrayList<ArrayList<Integer>> list, int row, int col, 
                   boolean visited[][], int ROW, int COL) 
    { 
        // row number is in range, column number is in range 
        // and value is 1 and not yet visited 
        return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (list.get(row).get(col) == 1 && !visited[row][col]); 
    } 
  
    // A utility function to do DFS for a 2D boolean matrix. 
    // It only considers the 8 neighbors as adjacent vertices 
    static void DFS(ArrayList<ArrayList<Integer>> list, int row, int col, boolean visited[][], int ROW, int COL) 
    { 
        // These arrays are used to get row and column numbers 
        // of 8 neighbors of a given cell 
        int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 }; 
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 }; 
  
        // Mark this cell as visited 
        visited[row][col] = true; 
  
        // Recur for all connected neighbours 
        for (int k = 0; k < 8; ++k) 
            if (isSafe(list, row + rowNbr[k], col + colNbr[k], visited, ROW, COL)) 
                DFS(list, row + rowNbr[k], col + colNbr[k], visited, ROW,COL); 
    } 
    // Function to find the number of island in the given list
    // N, M: size of list row and column respectively
    static int findIslands(ArrayList<ArrayList<Integer>> list, int N, int M)
    {
        
        // Your code here
        boolean visited[][] = new boolean[N][M]; 
  
        // Initialize count as 0 and travese through the all cells 
        // of given matrix 
        int count = 0; 
        for (int i = 0; i < N; ++i) 
            for (int j = 0; j < M; ++j) 
                if (list.get(i).get(j) == 1 && !visited[i][j]) // If a cell with 
                { // value 1 is not 
                    // visited yet, then new island found, Visit all 
                    // cells in this island and increment island count 
                    DFS(list, i, j, visited, N, M); 
                    ++count; 
                } 
  
        return count; 
        
    }
    
}
