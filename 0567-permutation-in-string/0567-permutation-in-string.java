class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int n = s1.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i < n;  i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for(int i = 0; i <= s2.length() - n; i++){
            HashMap<Character, Integer> map2 = new HashMap<>();
            for(int j = i; j < i + n; j++){
                map2.put(s2.charAt(j), map2.getOrDefault(s2.charAt(j), 0) + 1);
            }
            if(map1.equals(map2)){
                return true;
            }
        } 
        return false;
    }
}