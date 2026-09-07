class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String original = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                original += s.charAt(i);
            }
        }
        String copy = "";
        for(int i = original.length() - 1; i >= 0; i--){
            copy += original.charAt(i);
        }
        return copy.equals(original);
    }
}