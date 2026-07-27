class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1 = 0;
        int p2=0;
        int s_len = s.length();
       int  t_len = t.length();
       while(p1 <s_len && p2<t_len){
        if(s.charAt(p1) == t.charAt(p2)){
            p1++;
        }
        p2++;
       }
       if(p1 == s_len){
        return true;
       }
       return false;
    }
}