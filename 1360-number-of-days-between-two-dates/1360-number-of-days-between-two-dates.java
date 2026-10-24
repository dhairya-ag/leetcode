class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int days1 = 0;
        days1 += Integer.parseInt(date1.substring(8));
        int startYear = Integer.parseInt(date1.substring(0, 4));
        for(int i = 1900; i  < startYear; i++){
            if(i % 4 == 0 && i != 1900){
                days1 += 366;
            }else{
                days1 += 365;
            }
        }
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int startMonth = Integer.parseInt(date1.substring(5, 7));
        for(int i = 0; i  < startMonth - 1; i++){
            days1 += months[i];
        }
        if(startYear % 4 == 0 && startYear != 2100 && startMonth > 2){
            days1++;
        }
        int days2 = 0;
        days2 += Integer.parseInt(date2.substring(8));
        int endYear = Integer.parseInt(date2.substring(0, 4));
        for(int i = 1900; i  < endYear; i++){
            if(i % 4 == 0 && i != 1900){
                days2 += 366;
            }else{
                days2 += 365;
            }
        }
        int endMonth = Integer.parseInt(date2.substring(5, 7));
        for(int i = 0; i  < endMonth - 1; i++){
            days2 += months[i];
        }
        if(endYear % 4 == 0 && endYear != 2100 && endMonth > 2){
            days2++;
        }
        return Math.abs(days2 - days1);
    }
}