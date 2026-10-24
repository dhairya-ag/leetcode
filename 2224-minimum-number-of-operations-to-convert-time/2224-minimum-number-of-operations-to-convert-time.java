class Solution {
    public int convertTime(String current, String correct) {
        int steps = 0;
        int diff = (Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3))) - (Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3)));
        while(diff >= 60){
            diff -= 60;
            steps++;
        }
        while(diff >= 15){
            diff -= 15;
            steps++;
        }
        while(diff >= 5){
            diff -= 5;
            steps++;
        }
        while(diff >= 1){
            diff -= 1;
            steps++;
        }
        return steps;
    }
}