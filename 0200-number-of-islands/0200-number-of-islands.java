class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    helper(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private boolean helper(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return true;
        if(grid[i][j] == '0') return false;
        grid[i][j] = '0';
        boolean up = helper(grid, i - 1, j);
        boolean down = helper(grid, i + 1, j);
        boolean right = helper(grid, i, j + 1);
        boolean left = helper(grid, i, j - 1);
        return up && down && right && left;
    }
}