class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) return 0;
        long quotient = 0;
        boolean sign = true;
        if((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)){
            sign = true;
        }else{
            sign = false;
        }
        long a = (long)dividend;
        long b = (long)divisor;
        if(a < 0) a = -a;
        if(b < 0) b = -b;
        while(a >= b){
            long temp = b;
            long count = 1;
            while (a - temp >= temp) {
                temp += temp;
                count += count;
            }
            a -= temp;
            quotient += count;
        }
        if(!sign) quotient = -quotient;
        if(quotient > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(quotient < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)quotient;
    }
}