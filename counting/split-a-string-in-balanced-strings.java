class Solution {
    public int balancedStringSplit(String s) {
        int numberOfSubString = 0;
        int balance =0;
            for(char ch : s.toCharArray()){
                if(ch == 'L'){
                    balance++;
                } else {
                    balance--;
                }
                if(balance ==0){
                numberOfSubString++;
                }
            }
            
        return numberOfSubString;
    }
}