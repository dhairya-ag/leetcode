class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orig = image[sr][sc];
        if(orig == color) return image;
        helper(image, sr, sc, color, orig);
        return image;
    }
    private void helper(int[][] image, int i, int j, int color, int orig){
        if(i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != orig) return;
        image[i][j] = color;
        helper(image, i + 1, j, color, orig);
        helper(image, i, j + 1, color, orig);
        helper(image, i - 1, j, color, orig);
        helper(image, i, j - 1, color, orig);
    }
}