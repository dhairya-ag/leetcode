class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> coloumn = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    coloumn.add(j);
                }
            }
        }
        for(int j=0;j<coloumn.size();j++){
            for(int i=0;i<matrix.length;i++){
            matrix[i][coloumn.get(j)]=0;
            }
        }
        for(int i=0;i<row.size();i++){
            for(int j=0;j<matrix[0].length;j++){
            matrix[row.get(i)][j]=0;
            }
        }
    }
}