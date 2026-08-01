class Solution {
    public int maxVowels(String s, int k) {
        int maxVowel = 0;
        for(int i =0;i<s.length()-k;i++){
            int count = 0;
            for(int j = i;j<i+k;j++){
               char ch = s.charAt(j);
               if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
                }
                
            }
            maxVowel = Math.max(count,maxVowel);
        }
      return maxVowel;
    }
}