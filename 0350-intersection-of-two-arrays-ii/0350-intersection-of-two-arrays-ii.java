class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int num: nums1){
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        for(int num: nums2){
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: map1.keySet()){
            if(map2.containsKey(num)){
                for(int i=0;i<Math.min(map1.get(num),map2.get(num));i++){
                    list.add(num);
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i =0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}