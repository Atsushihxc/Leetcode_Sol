class Solution {
	private void dfs(char[][] grid, int r, int c) {
		int nr = grid.length;
		int nc = grid[0].length;
		if(r<0 || c<0 || r>=nr ||c>=nc) return;
		if(grid[r][c]== 0) return;
		grid[r][c] =0;
		dfs(grid, r-1,c);
		dfs(grid, r,c-1);
		dfs(grid,r, c+1);
		dfs(grid,r+1,c);

		
	}
    public int numIslands(char[][] grid) {
    	if(grid == null || grid.length ==0);
    	int nr = grid.length;
		int nc = grid[0].length;
		int island = 0;
		for(int i =0; i<nr;i++) {
			for (int j =0; j<nc; j++) {
				if(grid[i][j] ==1) {
					island++;
					dfs(grid, i,j);
				}
					
			}
		}
		return island;
        
    }
}