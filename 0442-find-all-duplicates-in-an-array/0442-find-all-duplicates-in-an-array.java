class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length  + 1; i++){
            list.add(0);
        }
        for(int num: nums){
            list.set(num, list.get(num)+1);
        }
        int count = 0;
        for(int num: list){
            if(num == 2){
                count++;
            }
        }
        int[] arr = new int[count];
        count = 0;
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) == 2){
                arr[count] = i;
                count++;
            }
        }
        list.clear();
        for(int i = 0; i < count; i++){
            list.add(arr[i]);
        }
        return list;
    }
}