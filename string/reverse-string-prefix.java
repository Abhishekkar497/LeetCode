class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder text = new StringBuilder(s);
        int left =0;
        int right = k-1;
        while(left < right){
            char temp = text.charAt(left);
            text.setCharAt(left,text.charAt(right));
            text.setCharAt(right,temp);
            left++;
            right--;

        }
        return text.toString();
    
    }
}