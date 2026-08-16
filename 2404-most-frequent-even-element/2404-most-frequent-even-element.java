class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        if (map.isEmpty())
            return -1;
        int maxFreq = 0;
        int ans = -1;
        for (int num : map.keySet()) {
            if (map.get(num) > maxFreq) {
                maxFreq = map.get(num);
                ans = num;
            } else if (map.get(num) == maxFreq && num < ans) {
                ans = num;
            }
        }
        return ans;
    }
}