class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i = 0;
        int j = skill.length - 1;
        int req = skill[i] + skill[j];
        long sum = 0;
        while(i < j){
            if(skill[i] + skill[j] != req) return -1;
            sum += skill[i] * skill[j];
            i++;
            j--;
        }
        return sum;
    }
}