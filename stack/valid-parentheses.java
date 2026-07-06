class Solution {
    public boolean isValid(String s) {
        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.append(ch); // push
            } 
            else {
                int len = stack.length();
                
                if (len == 0) return false;
                
                char top = stack.charAt(len - 1);
                
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    
                    stack.deleteCharAt(len - 1); // pop
                } else {
                    return false;
                }
            }
        }

        return stack.length() == 0;
    }
    }
