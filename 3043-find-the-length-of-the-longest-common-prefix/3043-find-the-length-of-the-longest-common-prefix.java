class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            while(num > 0){
                set.add(num);
                num  = num / 10;
            }
        }
        int ans = 0;
        for(int num : arr2){
            int length = 0;
            while(num > 0){
                if(set.contains(num)){
                    length = String.valueOf(num).length();
                    break;
                }
                num = num / 10;
            }
            ans = Math.max(ans, length);
        }
        return ans;
    }
}