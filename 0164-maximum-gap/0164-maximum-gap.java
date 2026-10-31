class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int num: nums){
            set.add(num);
        }
        int i = 0;
        for(int num: set){
            nums[i++] = num;
        }
        int maxDiff = 0;
        for(int j = 1; j < i; j++){
            maxDiff = Math.max(maxDiff, nums[j] - nums[j - 1]);
        }
        return maxDiff;
    }
}