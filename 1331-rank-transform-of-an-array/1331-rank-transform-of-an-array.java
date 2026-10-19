class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] original = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            original[i] = arr[i];
        }
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(i == 0) map.put(arr[0], 1);
            if(!map.containsKey(arr[i]) && i != 0){
                map.put(arr[i], map.get(arr[i - 1]) + 1);
            }
        }
        int[] rank = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            rank[i] = map.get(original[i]);
        }
        return rank;
    }
}