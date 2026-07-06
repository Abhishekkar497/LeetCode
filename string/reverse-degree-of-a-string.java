class Solution {
    public int reverseDegree(String s) {
        int [] alphabets = new int[128];
        int value =0;
        for(char ch = 'a'; ch <= 'z'; ch++) {
         alphabets[ch] = 'z' - ch + 1;
        }
       for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
         value += alphabets[ch] * (i + 1);
       }
        return value;
    }
}