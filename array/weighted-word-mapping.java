class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
                
        for(String word : words){
            int weight = 0;
  
            for(char c : word.toCharArray()){
               weight += weights[c - 'a'];
            }
            int modulo = weight %26;
           char ch = (char)('z' - modulo);
            ans.append(ch);
        }
      return ans.toString();
    }
}