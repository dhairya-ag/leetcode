class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] coloumns = new int[9][9];
        int[][] boxes = new int[9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0;  j < 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                int val = board[i][j] - '1';
                if(rows[i][val] == 1){
                    return false;
                }
                rows[i][val] = 1;
                if(coloumns[j][val] == 1){
                    return false;
                }
                coloumns[j][val] = 1;
                int boxIdx = 3 * (i / 3) + (j / 3);
                if(boxes[boxIdx][val] == 1){
                    return false;
                }
                boxes[boxIdx][val] = 1;
            }
        }
        return true;
    }
}