class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        char[] arr = new char[digits.length()];
        helper(digits, ans, 0, arr);
        return ans;
    }
    private void helper(String digits, List<String> ans, int i, char[] arr){
        if(i == digits.length()){
            ans.add(new String(arr));
            return;
        }
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String letters = map[digits.charAt(i) - '0'];
        for(int j = 0; j < letters.length(); j++){
            arr[i] = letters.charAt(j);
            helper(digits, ans, i+1, arr);
        }
    }
}