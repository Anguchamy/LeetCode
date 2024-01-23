class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTracking(result, "", n, 0, 0);
        return result;
    }

    public void backTracking(List<String> result, String paranthesis, int n, int open, int close) {
        if(paranthesis.length() == n*2) {
            if(isValidParanthesis(paranthesis)) {
                result.add(paranthesis);
            }
        }

        if(open < n) {
            backTracking(result, paranthesis + "(", n, open + 1, close);
        }

        if(close < n) {
            backTracking(result, paranthesis + ")", n, open, close + 1);
        }
    }

    public boolean isValidParanthesis(String paranthesis) {
        Stack<Character> stk = new Stack<>();
        for(char a : paranthesis.toCharArray()) {
            if(a == '(') {
                stk.push(a);
            } else {
                if(stk.isEmpty()) {
                    return false;
                }
                stk.pop();
            }
        }

        return stk.isEmpty();
    } 
}