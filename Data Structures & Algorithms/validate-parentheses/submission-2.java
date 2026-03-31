class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if(stack.isEmpty()) {
                return false;
            } else {
                if(isMatching(stack.peek(), c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isMatching(char c1, char c2) {
        return (c1=='[' && c2 == ']') || (c1=='(' && c2 == ')')
                || (c1=='{' && c2 == '}');
    }
}
