class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ')':
                    if (!stack.isEmpty() && stack.peek().equals("("))
                        stack.pop();
                    else
                        return false;
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek().equals("["))
                        stack.pop();
                    else
                        return false;
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek().equals("{"))
                        stack.pop();
                    else
                        return false;
                    break;

                default:
                    stack.push(String.valueOf(s.charAt(i)));
                    break;
            }
        }
        return stack.isEmpty();
    }
}