class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int num : nums){
            if(num == 0){
                count = 0;
            }else{
                count += 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}