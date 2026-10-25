class Solution {
    public int closedIsland(int[][] grid) {
        int count = 0;
        for(int i = 0; i  < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 0){
                    if(helper(grid, i, j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    private boolean helper(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return false;
        }
        if(grid[i][j] == 1) return true;
        grid[i][j] = 1;
        boolean left = helper(grid, i, j - 1);
        boolean up = helper(grid, i - 1, j); 
        boolean right = helper(grid, i, j + 1); 
        boolean down = helper(grid, i + 1, j);
        return left && up && right && down;
    }
}