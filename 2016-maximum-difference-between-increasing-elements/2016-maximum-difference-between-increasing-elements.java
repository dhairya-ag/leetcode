class Solution {
    public int maximumDifference(int[] nums) {
        int max = 0;
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            max = Math.max(max, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        if (max == 0) return -1;
        return max;
    }
}