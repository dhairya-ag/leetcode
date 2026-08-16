class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char num: s.toCharArray()){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1) && map.get(s.charAt(i))==s.charAt(i)-'0' && map.get(s.charAt(i+1))==s.charAt(i+1)-'0'){
                return ""+s.charAt(i)+s.charAt(i+1);
            }
        }
        return "";
    }
}