class Solution {
    public int maxDistance(int[] colors) {
        int house =  colors[0];
        int maxDistance = 0;
        int n = colors.length;
        for(int i = n - 1; i > 0; i--){
            if(colors[i] != house){
                maxDistance = i;
                break;
            }
        }
        house = colors[n-1];
        for(int i = 0; i < n-1; i++){
            if(colors[i] != house){
                maxDistance = Math.max(maxDistance, n-1-i);
            }
        }
        return maxDistance;
    }
}