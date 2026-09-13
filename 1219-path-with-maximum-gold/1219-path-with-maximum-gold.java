class Solution {
    int ans = 0;
    public int getMaximumGold(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                helper(grid, i, j, 0);
            }
        }
        return ans;
    }
    private void helper(int[][] grid, int i, int j, int curr){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0){
            ans = Math.max(ans, curr);
            return;
        }
        int temp = grid[i][j];
        grid[i][j] = 0;
        helper(grid, i + 1, j, curr + temp);
        helper(grid, i - 1, j, curr + temp);
        helper(grid, i, j + 1, curr + temp);
        helper(grid, i, j - 1, curr + temp);
        grid[i][j] = temp;
    }
}