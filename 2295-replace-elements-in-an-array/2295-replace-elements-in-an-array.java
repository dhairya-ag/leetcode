class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < operations.length; i++){
            int old = operations[i][0];
            int newValue = operations[i][1];
            int index = map.get(old);
            nums[index] = newValue;
            map.remove(old);
            map.put(newValue, index);
        }
        return nums;
    }
}