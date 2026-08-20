class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        while(numOnes != 0 && k != 0){
            sum += 1;
            numOnes -= 1;
            k -= 1;
        }
        while(numZeros != 0 && k != 0){
            numZeros -= 1;
            k-= 1;
        }
        while(numNegOnes != 0 && k != 0){
            sum -= 1;
            numNegOnes -= 1;
            k-= 1;
        }
        return sum;
    }
}