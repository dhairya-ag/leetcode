class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int curr = 0;
            int zeros = 0;
            int j =  i;
            while(j < nums.length){
                if(nums[j] == 0){
                    zeros++;
                }
                if(zeros > k){
                    break;
                }
                curr++;
                j++;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}