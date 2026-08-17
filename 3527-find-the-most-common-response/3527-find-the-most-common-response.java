class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String, Integer> map = new HashMap<>();
        for(List<String> row: responses){
            HashSet<String> set = new HashSet<>(row);
            for(String response: set){
                map.put(response, map.getOrDefault(response, 0) + 1);
            }
        }
        int maxFreq = 0;
        String ans = "";
        for(String response: map.keySet()){
            if(map.get(response) > maxFreq){
                maxFreq = map.get(response);
                ans = response;
            } else if (maxFreq == map.get(response) && ans.compareTo(response)>0){
                ans = response;
            }
        }
        return ans;
    }
}