class Solution {
    public String longestPalindrome(String s) {
        for(int i = s.length(); i >= 1; i--){
            for(int j = 0; j + i <= s.length(); j++){
                int k = i + j;
                if(isPalindrome(s.substring(j, k))){
                    return s.substring(j, k);
                }
            }
        }
        return "";
    }
    private boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}