class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int alice = 0;
        int astartm = Integer.parseInt(arriveAlice.substring(0, 2));
        int astart = 0;
        for(int i = 0; i < astartm - 1; i++){
            astart += days[i];
        }
        astart += Integer.parseInt(arriveAlice.substring(3));
        int alastm = Integer.parseInt(leaveAlice.substring(0, 2));
        int aend = 0;
        for(int i = 0; i < alastm - 1; i++){
            aend += days[i];
        }
        aend += Integer.parseInt(leaveAlice.substring(3));
        int bstartm = Integer.parseInt(arriveBob.substring(0, 2));
        int bstart = 0;
        for(int i = 0; i < bstartm - 1; i++){
            bstart += days[i];
        }
        bstart += Integer.parseInt(arriveBob.substring(3));
        int blastm = Integer.parseInt(leaveBob.substring(0, 2));
        int bend = 0;
        for(int i = 0; i < blastm - 1; i++){
            bend += days[i];
        }
        bend += Integer.parseInt(leaveBob.substring(3));
        int start = Math.max(astart, bstart);
        int end = Math.min(aend, bend);
        if(start <= end){
            return end - start + 1;
        }
        return 0;
    }
}