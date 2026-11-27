class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = nums[i];
        }
        for(int i = 0; i < n; i++){
            arr2[i] = nums[i + n];
        }
        int j = 0;
        for(int i = 0; i < n; i++){
            nums[j] = arr1[i];
            nums[j + 1] = arr2[i];
            j += 2;
        }
        return nums;
    }
}