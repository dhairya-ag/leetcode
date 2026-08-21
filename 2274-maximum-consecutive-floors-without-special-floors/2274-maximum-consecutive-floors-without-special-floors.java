class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        if(special.length == 0) return top-bottom;
        if(special.length == 1) return Math.max(special[0]-bottom, top - special[0]);
        if(special.length == top - bottom) return 0;
        int maxDiff = special[1] - special[0]; 
        for(int i = 2; i < special.length; i++){
            maxDiff = Math.max(maxDiff, special[i] - special[i-1]);
        }
        return Math.max(maxDiff - 1, Math.max(special[0] - bottom, top - special[special.length-1]));
    }
}