class Solution {
    long sum;
    public int countIslands(int[][] grid, int k) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] > 0){
                    sum = 0;
                    helper(grid, i, j);
                    if(sum % k == 0) count++;
                }
            }
        }
        return count;
    }
    private void helper(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return;
        sum += grid[i][j];
        grid[i][j] = 0;
        helper(grid, i - 1, j);
        helper(grid, i + 1, j);
        helper(grid, i, j - 1);
        helper(grid, i, j + 1);
    }
}