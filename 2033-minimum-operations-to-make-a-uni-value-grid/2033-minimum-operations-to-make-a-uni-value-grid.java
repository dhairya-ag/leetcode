class Solution {
  public int minOperations(int[][] grid, int x) {
    int m = grid.length;
    int n = grid[0].length;
    int[] temp = new int[m * n];
    int k = 0;
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            temp[k++] = grid[i][j];
        }
    }
    Arrays.sort(temp);
    k = 0;
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            grid[i][j] = temp[k++];
        }
    }
    int mid = temp[(m * n) / 2];
    int count = 0;
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(Math.abs(grid[i][j] - mid) % x != 0) return -1;
            count += Math.abs(grid[i][j] - mid) / x;
        }
    }
    return count;
  }
}