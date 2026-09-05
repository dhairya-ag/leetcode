class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] copy = new int[n][m];
        for(int i =0; i <n; i++){
            for(int j=0; j<m; j++){
                copy[i][j] = board[i][j];
            }
        }
        for(int i =0; i <n; i++){
            for(int j=0; j<m; j++){
                int count = 0;
                for(int x = i -1; x <= i+1; x++){
                    for(int y = j-1; y <= j+1; y++){
                        if(x >= 0 && x < n && y >= 0 && y < m && !(x == i && y == j)){
                            count += copy[x][y];
                        }
                    }
                }
                if(copy[i][j] == 1){
                    if(count < 2 || count > 3){
                        board[i][j] = 0;
                    }
                }else{
                    if(count == 3){
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}