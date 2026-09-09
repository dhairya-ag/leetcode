// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int max = 0;
//         String ans = "";
//         for(int i = 0; i < s.length(); i++){
//             if(!containing(ans, s.charAt(i))){
//                 ans += s.charAt(i);
//             }else{
//                 int j = 0;
//                 while(ans.charAt(j) != s.charAt(i)){
//                     j++;
//                 }
//                 ans = ans.substring(j+1);
//                 ans += s.charAt(i);
//             }
//             max = Math.max(max, ans.length());
//         }
//         return max;
//     }
//     private boolean containing(String s, char c){
//         for(char ch : s.toCharArray()){
//             if(ch == c){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int max = 0;
        for(int j = 0; j < s.length(); j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            max = Math.max(max, set.size());
        }
        return max;
    }
}