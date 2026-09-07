class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length < 1) return res;
        if(strs.length == 1) return strs[0];
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != c){
                    return res;
                }
            }
            res += c;
        }
        return res;
    }
}