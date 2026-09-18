class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = s.length(); i >= 1; i--){
            for(int j = 0; j + i <= s.length(); j++){
                int k = i + j;
                if(isPalindrome(s.substring(j, k))){
                    count++;
                }
            }
        }
        return count;
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