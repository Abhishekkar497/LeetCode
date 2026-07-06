class Solution {
    public String interpret(String command) {
      StringBuilder str = new StringBuilder();
       int length = command.length();
       for(int i =0;i<length;){
        char ch = command.charAt(i);
        if(ch == 'G'){
            str.append('G');
            i+=1;
        } else if(ch == '(' && command.charAt(i+1) == ')'){
            str.append('o');
            i+=2;
        } 
        else {
            str.append("al");
            i+=4;
        }
       }
        return str.toString();
    }
   
}