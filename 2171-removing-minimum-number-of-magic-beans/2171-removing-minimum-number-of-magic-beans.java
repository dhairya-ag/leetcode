class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sum = 0;
        for(int num : beans) sum += num;
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < beans.length; i++){
            long rem = (long) beans[i] * (beans.length - i);
            ans = Math.min(ans, sum - rem);
        }
        return ans;
    }
}