/**
 * for this question, it is necessary to look through all
 * the island
 * if we have an island, it will have 4 sides
 * but if it has a neighbour, each neighbour will close
 * of the sides
 * @author Atsushi
 *
 */
class Solution {
    public int islandPerimeter(int[][] grid) {
    	int island = 0;
    	int edge  =0 ;
    	for(int i =0; i<grid.length; i++) {
    		for(int j =0; j<grid[0].length; j++) {
    			if(grid[i][j] ==1) {
    				island +=1;
    				if( i>=1) {
    					if(grid[i-1][j] ==1) edge +=1;
    				}
    				if(j>=1) {
    					if(grid[i][j-1] ==1) edge +=1;
    				}
    				if(i<grid.length-1) {
    					if(grid[i+1][j] == 1) edge +=1;
    					
    				}
    				if(j<grid[0].length-1) {
    					if(grid[i][j+1]==1) edge +=1;
    				}
    				
    			}
    		
    		}
    	}
    	return 4*island - edge;
        
    }
}