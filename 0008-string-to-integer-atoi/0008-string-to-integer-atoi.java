class Solution {
    public int myAtoi(String s) {
        long num = 0;
        s = s.trim();
        if(s.length() == 0) return 0;
        int i = 0;
        boolean neg = false;
        if(s.charAt(i) == '-'){
            neg = true;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            num = num * 10 + (s.charAt(i) - '0');
            if (neg && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE; 
            if (!neg && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        if(neg) return (int)-num;
        return (int)num;
    }
}