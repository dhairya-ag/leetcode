class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
        return helper(grid, 0, 0);
    }
    private boolean helper(int[][] grid, int i, int j){
        if(grid[i][j] == grid.length * grid[0].length - 1) return true;
        // 2 up 1 left
        if(i - 2 < grid.length && j - 1 < grid[0].length && i - 2 >= 0 && j - 1 >= 0 && grid[i-2][j-1] == grid[i][j] + 1){
            return helper(grid, i - 2, j - 1);
        }
        // 2 up 1 right
        if( i - 2 < grid.length && j + 1 < grid[0].length && i - 2 >= 0 && j + 1 >= 0  && grid[i-2][j+1] == grid[i][j]+1){
            return helper(grid, i - 2, j + 1);
        }
        //2 right 1 up
        if(i - 1 < grid.length && j + 2 < grid[0].length && i - 1 >= 0 && j + 2 >= 0 && grid[i-1][j+2] == grid[i][j] + 1){
            return helper(grid, i - 1, j + 2);
        }
        // 2 right 1 down
        if(i + 1 < grid.length && j + 2 < grid[0].length && i + 1 >= 0 && j + 2 >= 0 && grid[i+1][j+2] == grid[i][j] + 1){
            return helper(grid, i + 1, j + 2);
        }
        // 2 down 1 right
        if(i + 2 < grid.length && j + 1 < grid[0].length && i + 2 >= 0 && j + 1 >= 0 && grid[i+2][j+1] == grid[i][j] + 1){
            return helper(grid, i + 2, j + 1);
        }
        // 2 down 1 left
        if(i + 2 < grid.length && j - 1 < grid[0].length && i + 2 >= 0 && j - 1 >= 0 && grid[i+2][j-1] == grid[i][j] + 1){
            return helper(grid, i + 2, j - 1);
        }
        // 2 left 1 down
        if(i + 1 < grid.length && j - 2 < grid[0].length && i + 1 >= 0 && j -2 >= 0 && grid[i+1][j-2] == grid[i][j] + 1){
            return helper(grid, i + 1, j - 2);
        }
        // 2 left 1 up
        if(i - 1 < grid.length && j - 2 < grid[0].length && i - 1 >= 0 && j - 2 >= 0 && grid[i-1][j-2] == grid[i][j] + 1){
            return helper(grid, i - 1, j - 2);
        }
        return false;
    }
}