class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(nums, ans, used, new ArrayList<Integer>());
        return ans;
    }
    private void helper(int[] nums, List<List<Integer>> ans, boolean[] used, List<Integer> list){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j = 0; j < nums.length; j++){
            if(used[j]){
                continue;
            }
            list.add(nums[j]);
            used[j] = true;
            helper(nums, ans, used, list);
            list.remove(list.size() - 1);
            used[j] = false;
        }
    }
}