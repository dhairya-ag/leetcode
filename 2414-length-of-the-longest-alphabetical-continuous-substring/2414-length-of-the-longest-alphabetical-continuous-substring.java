class Solution {
    public int longestContinuousSubstring(String s) {
        // if("abcdefghijklmnopqrstuvwxyz".contains(s)) return s.length();
        // return Math.max(longestContinuousSubstring(s.substring(0, s.length()-1)), longestContinuousSubstring(s.substring(1, s.length())));
        int count = 1;
        int max = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1) + 1){
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}