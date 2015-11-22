
public class PathCounts {


		/** Main method **/
	    public static void main(String[] args) 
	    {
	    	        int M,N,i =0, j=0;
	    	    	
	    	    	int[][] a  = new int[][]{
	    	    			  { 1, 0, 1 },
	    	    			  { 0, 1, 1 },
	    	    			  { 1, 1, 1 },
	    	    			  
	    	    			//  { 1, 1, 1 },
	    	    			//  { 0, 0, 0 },
	    	    			//  { 0, 0, 0 },	    	    			  
	    	    			 
	    	    			};
	    	    	
	    	    	M = a.length;     //rows
	    	    	N = a[0].length;  //cols		  
	    	    			  
	    	    	/*
	    	    	 * The following was from the original.  I did not load the array with 1,000 entries.
	    	    	 * This is a proof of concept solution	    	    	 * 
	    	    	 
	    	    	for( i =0; i < M; i++)
	    	    		for( j = 0;j< N; j++)
	    	    			//scanf("%d",&a[a][j]);
	    	    	*/
   			System.out.println("number of paths: " + numberOfPaths(a,M,N));
  	    	
	                              
	    }    
	    
	    
		// Returns count of possible paths to reach cell at row number m and column
		// if any 0 value in path it is not a valid path and will not be counted
	    public static int numberOfPaths(int[][] count, int m, int n)
		{
 
		    // row paths
		   // for (int i = 0; i < m; i++)
		    //    count[i][0] = 1;
		 
		    // Count of paths to reach any cell in first column is 1
		    //for (int j = 0; j < n; j++)
		     //   count[0][j] = 1;
		 
		    // Calculate count of paths for other cells in bottom-up manner using
		    // the recursive solution
		    for (int i = 1; i < m; i++)
		    {
		        for (int j = 1; j < n; j++) {
		 
		             
		           // if (count[i-1][j]==1 && count[i][j-1]==1)
	   	        	  count[i][j] = count[i-1][j] + count[i][j-1];  
			        if (count[i][j]<2) break;   	        	  
		        }    
		 
		    }
		    
		    for (int i = 1; i < m; i++)
		    {
		        for (int j = 1; j < n; j++) {		    
		    
        	System.out.println("count[i-1][j]:"+count[i-1][j] + " i:"+i + " j:" +j);
        	System.out.println("count[i][j-1]:"+count[i][j-1]);
		        }
        	
		    }

		    
		    System.out.println("m:" + m + "  n: " + n);
		    return count[m-1][n-1];
		}	
		
		
		
	}