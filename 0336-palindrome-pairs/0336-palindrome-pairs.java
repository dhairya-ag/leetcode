class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            map.put(words[i], i);
        }
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            for(int j = 0; j <= word.length(); j++){
                String left = word.substring(0, j);
                String right = word.substring(j);
                if(isPalindrome(left)){
                    String reverse = new StringBuilder(right).reverse().toString();
                    if(map.containsKey(reverse) && map.get(reverse) != i){
                        ans.add(Arrays.asList(map.get(reverse), i));
                    }
                }
                if(j != word.length() && isPalindrome(right)){
                    String reverse = new StringBuilder(left).reverse().toString();
                    if(map.containsKey(reverse) && map.get(reverse) != i){
                        ans.add(Arrays.asList(i, map.get(reverse)));
                    }
                }
            }
        }
        return ans;
    }
    private boolean isPalindrome(String s){
        int i =0;
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