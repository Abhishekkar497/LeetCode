class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[128];
        int maxVowel = 0;
        int maxConsonent = 0;
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        for(char ch : s.toCharArray()){
            if(ch == 'a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                maxVowel = Math.max(freq[ch],maxVowel);
            }else 
             maxConsonent= Math.max(freq[ch],maxConsonent);
        }
        return maxVowel+maxConsonent;
    }
}