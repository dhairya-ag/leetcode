class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        String prev = "";
        for(String word : words){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(!s.equals(prev)){
                ans.add(word);
                prev = s;
            }
        }
        return ans;
    }
}