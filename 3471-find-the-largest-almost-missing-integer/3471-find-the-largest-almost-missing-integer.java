class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k == nums.length){
            int max = nums[0];
            for(int num: nums){
                max = Math.max(max, num);
            }
            return max;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        if(k  == 1){
            int max = -1;
            for(int num: map.keySet()){
                if(map.get(num) == 1){
                    max= Math.max(max, num);
                }
            }
            return max;
        }
        if(map.get(nums[0]) == 1 && map.get(nums[nums.length-1]) == 1){
            return Math.max(nums[0], nums[nums.length - 1]);
        }
        if(map.get(nums[0]) == 1 || map.get(nums[nums.length-1]) == 1){
            if(map.get(nums[0]) > 1) return nums[nums.length - 1];
            return nums[0];
        }
        return -1;
    }
}