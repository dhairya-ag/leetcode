class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] arr = answerKey.toCharArray();
        int f = 0;
        int j = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'F'){
                f++;
            }
            while(f > k && j < arr.length){
                if(arr[j] == 'F'){
                    f--;
                }
                j++;
            }
            max = Math.max(max, i - j + 1);
        }
        int t = 0;
        j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'T'){
                t++;
            }
            while(t > k && j < arr.length){
                if(arr[j] == 'T'){
                    t--;
                }
                j++;
            }
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}