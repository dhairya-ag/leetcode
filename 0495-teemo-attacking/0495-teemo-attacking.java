class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        if(timeSeries.length > 0) count += duration;
        for(int i = 1; i < timeSeries.length; i++){
            if(timeSeries[i] - timeSeries[i-1] < duration){
                count = count + timeSeries[i] - timeSeries[i-1];
            }else{
                count += duration;
            }
        }
        return count;
    }
}