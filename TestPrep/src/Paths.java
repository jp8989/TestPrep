
public class Paths {

	/** Main method **/
    public static void main(String[] args) 
    {
    	 
    	    	
//    	    	int M=1000,N=100,i =0, j=0;
    	
    	        int M,N,i =0, j=0;
    	    	
    	    	//scanf("%d %d", &M, &N);
    	    	//int a[][] = new int[1000][100];
    	    	
    	    	int[][] a  = new int[][]{
    	    			  { 1, 1, 1 },
    	    			  { 1, 0, 1 },
    	    			 
    	    			};
    	    	
    	    	
    	    	M = a.length;
    	    	N = a[0].length;		  
    	    			  
    	    			  
//    	    	for( i =0; i < M; i++)
//    	    		for( j = 0;j< N; j++)
    	    			//scanf("%d",&a[a][j]);
   	    			System.out.println("number of paths: " + numberOfPaths(a,M,N));
    	    	
    	    	 
    	
//    	int[][] count = new int[][]{
//    			  { 1, 1, 1 },
//    			  { 1, 0, 1 },
//    			 
//    			};
//    	
//    	int a = numberOfPaths(count, 2, 3);
//    	    	
//        System.out.println("\nNumber of Paths: " + a);        
                              
    }    
    
    
	// Returns count of possible paths to reach cell at row number m and column
	// number n from the topmost leftmost cell (cell at 1, 1)
    public static int numberOfPaths(int[][] count, int m, int n)
	{
	    // Create a 2D table to store results of subproblems
    	//int count[][] = new int[m][n];
	   	 
	    // Count of paths to reach any cell in first column is 1
	    for (int i = 0; i < m; i++)
	        count[i][0] = 1;
	 
	    // Count of paths to reach any cell in first column is 1
	    for (int j = 0; j < n; j++)
	        count[0][j] = 1;
	 
	    // Calculate count of paths for other cells in bottom-up manner using
	    // the recursive solution
	    for (int i = 1; i < m; i++)
	    {
	        for (int j = 1; j < n; j++)
	 
	            // By uncommenting the last part the code calculatest he total
	            // possible paths if the diagonal Movements are allowed
	            if (count[i-1][j]==1 && count[i][j-1]==1)
   	        	  count[i][j] = count[i-1][j] + count[i][j-1]; //+ count[i-1][j-1];
	 
	    }
	    
	    System.out.println("m:" + m + "  n: " + n);
	    return count[m-1][n-1];
	}	
	
	
	
}
