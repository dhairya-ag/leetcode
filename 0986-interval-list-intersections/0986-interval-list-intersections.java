class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < firstList.length && j < secondList.length){
            int first = Math.max(firstList[i][0], secondList[j][0]);
            int second = Math.min(firstList[i][1], secondList[j][1]);
            if(first <= second){
                int[] arr = new int[2];
                arr[0] = first;
                arr[1] = second;
                list.add(arr);
            }
            if(firstList[i][1] > secondList[j][1]){
                j++;
            } else {
                i++;
            }
        }
        int[][] arr = new int[list.size()][2];
        for(int k = 0; k < list.size(); k++){
            arr[k][0] = list.get(k)[0];
            arr[k][1] = list.get(k)[1];
        }
        return arr;
    }
}