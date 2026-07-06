class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] mappedChars = new boolean[128];
        int count = 0;
        for(char ch : jewels.toCharArray()){
            mappedChars[ch] = true;
        }
        for(char c : stones.toCharArray()){
            if(mappedChars[c]){
                count++;
            }
        }
        return count;
    }
}