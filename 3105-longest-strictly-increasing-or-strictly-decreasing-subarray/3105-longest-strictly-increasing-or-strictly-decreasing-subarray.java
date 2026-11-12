class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen = 1;
        for(int i = 1; i < nums.length; i++){
            int curr = 1;
            while(i < nums.length && nums[i] > nums[i - 1]){
                curr++;
                i++;
            }
            maxLen = Math.max(maxLen, curr);
        }
        for(int i = 1; i < nums.length; i++){
            int curr = 1;
            while(i < nums.length && nums[i - 1] > nums[i]){
                curr++;
                i++;
            }
            maxLen = Math.max(maxLen, curr);
        }
        return maxLen;
    }
}