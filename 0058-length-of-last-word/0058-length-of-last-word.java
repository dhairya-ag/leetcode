class Solution {
    public int lengthOfLastWord(String s) {
        int last = 0;
        s = s.trim();
        for(int j = s.length() - 1; j >= 0; j--){
            if(s.charAt(j) == ' '){
                break;
            }
            last++;
        }
        return last;
    }
}