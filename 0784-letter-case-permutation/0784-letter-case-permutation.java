class Solution {
    public List<String> letterCasePermutation(String s) {
        char[] arr = s.toCharArray();
        List<String> list = new ArrayList<>();
        helper(arr, list, 0);
        return list;
    }
    private void helper(char[] arr, List<String> list, int i){
        if(i == arr.length ){
            list.add(new String(arr));
            return;
        }
        if(Character.isDigit(arr[i])){
            helper(arr, list, i+1);
        }else{
            arr[i] = Character.toLowerCase(arr[i]);
            helper(arr, list, i+1);
            arr[i] = Character.toUpperCase(arr[i]);
            helper(arr, list, i+1);
        }
    }
}