class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        int totalCount = 0;
        for (int num : nums) {
            if (num == candidate) {
                totalCount++;
            }
        }
        int leftCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == candidate) {
                leftCount++;
            }
            int leftSize = i + 1;
            int rightSize = n - leftSize;
            int rightCount = totalCount - leftCount;
            if (leftCount > leftSize / 2 && rightCount > rightSize / 2)
                return i;
        }
        return -1;
    }
}