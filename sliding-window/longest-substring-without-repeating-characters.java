class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int l =0,r=0;
        int hash[] = new int[256];
         Arrays.fill(hash,-1);
         int n =s.length();
         while(r < n){
            if(hash[s.charAt(r)] >=l){
              l = Math.max(hash[s.charAt(r)]+1,l);  
            }
            int len = r-l + 1;
            maxLen = Math.max(len,maxLen);
            hash [s.charAt(r)] = r;
            r++;
         }
        return maxLen;


    }
}