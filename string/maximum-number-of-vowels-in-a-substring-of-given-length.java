class Solution {
    public int maxVowels(String s, int k) {
    int maxVowelCount = 0;
    int count = 0;
    for(int i =0;i<k;i++){
        char ch = s.charAt(i);
        if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
        }
    }
    maxVowelCount = count ;
    System.out.println(maxVowelCount);
    
    int left = 0;
    for(int i = k;i<=s.length()-1;i++){
        char prev = s.charAt(left);
        char ch = s.charAt(i);
         if(prev == 'a' || prev =='e' || prev == 'i' || prev == 'o' || prev == 'u'){
              count--;
         }
         left++;
          if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
        }
        maxVowelCount = Math.max(count,maxVowelCount);

    }
    return maxVowelCount;
    }
}