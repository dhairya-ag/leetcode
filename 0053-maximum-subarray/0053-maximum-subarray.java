class Solution {
    public int maxSubArray(int[] nums) {
        int cMax = nums[0];
       
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            cMax = Math.max(nums[i],cMax+nums[i]);
    
            maxSum = Math.max(cMax,maxSum);
        }
        return maxSum;
    }
}