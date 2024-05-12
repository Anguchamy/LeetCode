class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i) == ')') {
                stack.push(i);
            } else if(s.charAt(i) == '(') {
                if(!stack.isEmpty() && s.charAt(stack.peek()) == ')') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        List<Integer> index = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()) {
            index.add(stack.pop());
        }
        for(int i=0;i<s.length();i++) {
            if(!index.contains(i)) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}