class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n; i += 2 * k){
            int x = i;
            int y = i + k - 1;
            if(y >= n) y = n - 1;
            while(x <= y){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                x++;
                y--;
            }
        }
        return new String(arr);
    }
}