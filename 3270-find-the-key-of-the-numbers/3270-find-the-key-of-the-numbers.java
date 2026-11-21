class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String s1 = digits(num1);
        String s2 = digits(num2);
        String s3 = digits(num3);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4; i++){
            int n1 = s1.charAt(i) - '0';
            int n2 = s2.charAt(i) - '0';
            int n3 = s3.charAt(i) - '0';
            int minm = Math.min(n1, Math.min(n2, n3));
            sb.append(String.valueOf(minm));
        }
        String ans = sb.toString();
        return Integer.parseInt(ans);
    }
    private String digits(int num){
        int digs = 0;
        int n = num;
        while(num > 0){
            digs++;
            num /= 10;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 4 - digs; i++){
            sb.append("0");
        }
        sb.append(String.valueOf(n));
        return sb.toString();
    }
}