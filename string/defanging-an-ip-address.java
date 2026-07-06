class Solution {
    public String defangIPaddr(String address) {
       StringBuilder adress = new StringBuilder();
       for(char c : address.toCharArray()){
         if (c == '.'){
            adress.append("[.]");
         }
         else {
            adress.append(c);
         }
       }
       return adress.toString();
    }
}