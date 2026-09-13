class Solution {
    int ans = 0;
    public int uniquePathsIII(int[][] grid) {
        int empty = 0;
        int r = 0;
        int c = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0) empty++;
                if(grid[i][j] == 1){
                    r = i;
                    c = j;
                }
            }
        }
        helper(grid, r, c, empty, 0);
        return ans;
    }
    private void helper(int[][] grid, int r, int c, int empty, int count){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == -1) return;
        if(grid[r][c] == 2){
            if(count - 1 == empty){
                ans++;
            }
            return;
        }
        int temp = grid[r][c];
        grid[r][c]  = -1;
        helper(grid, r+1, c, empty, count+1);
        helper(grid, r-1, c, empty, count+1);
        helper(grid, r, c+1, empty, count+1);
        helper(grid, r, c-1, empty, count+1);
        grid[r][c] = temp;
    }
}