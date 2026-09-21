class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, n, "", 0, 0);
        return ans;
    }
    private void helper(List<String> ans, int n, String s, int open, int close){
        if(s.length() >= 2 * n){
            ans.add(s);
            return;
        }
        if(open < n){
            helper(ans, n, s + "(", open + 1, close);
        }
        if(close < open){
            helper(ans, n, s + ")", open, close + 1);
        }
    }
}