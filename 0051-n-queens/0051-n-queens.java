class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row: board){
            Arrays.fill(row, '.');
        }
        helper(n, ans, board, 0);
        return ans;
    }
    private void helper(int n, List<List<String>> ans, char[][] board, int row){
        if(row == n){
            List<String> list = new ArrayList<>();
            for(char[] r : board){
                list.add(new String(r));
            }
            ans.add(list);
            return;
        }
        for(int j = 0; j < n; j++){
            if(isSafe(n, row, j, board)){
                board[row][j] = 'Q';
                helper(n, ans, board, row+1);
                board[row][j] = '.';
            }
        }
    }
    private boolean isSafe(int n, int r, int c, char[][] board){
        for(int i = 0; i < r; i++){
            if(board[i][c] == 'Q'){
                return false;
            }
        }
        for(int i = r - 1, j = c -1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = r - 1, j = c + 1; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}