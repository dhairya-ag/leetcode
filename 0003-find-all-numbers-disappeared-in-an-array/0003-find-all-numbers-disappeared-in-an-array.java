class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length+1;i++){
            list.add(0);
        }
        for(int i = 0; i < nums.length;  i++){
            list.set(nums[i], 1);
        }
        int count = 0;
        for(int num: list){
            if(num==0) {
                count++;
            }
        }
        int[] arr = new int[count];
        count =0;
        for(int i=1; i<list.size(); i++){
            if(list.get(i) == 0){
                arr[count] = i;
                count++;
            }
        }
        list.clear();
        for(int i=0; i<count; i++){
            list.add(arr[i]);
        }
        return list;
    }
}