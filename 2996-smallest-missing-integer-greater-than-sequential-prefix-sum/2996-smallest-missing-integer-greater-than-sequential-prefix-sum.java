class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length == 0) return 0;
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] == 1){
                max += nums[i];
            }else{
                break;
            }
        }
        boolean isPresent = true;
        while(isPresent){
            boolean changed = false;
            for(int num : nums){
                if(max == num){
                    max++;
                    changed = true;
                }
            }
            if(!changed){
                isPresent = false;
            }
        }
        return max;
    }
}