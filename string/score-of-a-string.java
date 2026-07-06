class Solution {
    public int scoreOfString(String s) {
        int score =0;
        for(int i =1;i<s.length();i++){
            int first = s.charAt(i-1);
            int second = s.charAt(i);
            score += Math.abs(first-second);
        }
        return score;
    }
}