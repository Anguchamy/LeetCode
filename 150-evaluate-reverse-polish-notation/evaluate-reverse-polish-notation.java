class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        boolean first = true;
        int currentVal = 0;
        for(String token : tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int val2 = Integer.valueOf(stack.pop());
                int val1 = Integer.valueOf(stack.pop());
                stack.push(getVal(val1, val2, token));
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.pop();
    }

    public int getVal(int val1, int val2, String symbol) {
        switch (symbol) {
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return val1 * val2;
            case "/":
                return val1 / val2;
        }
        return 0;
    }
}