class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>());
        for(int num : nums){
            int size = list.size();
            for(int i=0; i<size ;i++){
                List<Integer> sub = new ArrayList<>(list.get(i));
                sub.add(num);
                list.add(sub);
            }
            
        }
        return list;
    }
}