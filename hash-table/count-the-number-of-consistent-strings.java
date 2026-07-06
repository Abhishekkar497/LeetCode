class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
        boolean allowedChars[] = new boolean[26];
        for(int i =0;i<allowed.length();i++){
            allowedChars[allowed.charAt(i) - 'a'] = true;
        }
        for(String word : words){
            boolean valid = true;
            
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                if(!allowedChars[ch-'a']){
                    valid = false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;
    }
}