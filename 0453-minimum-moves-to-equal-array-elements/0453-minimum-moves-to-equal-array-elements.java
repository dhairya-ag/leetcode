class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int num: nums){
            min = Math.min(num, min);
        }
        int count = 0;
        for(int num : nums){
            count += num - min;
        }
        return count;
    }
}