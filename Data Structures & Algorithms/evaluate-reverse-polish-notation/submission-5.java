class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result=0;
        if(tokens.length==1) return Integer.parseInt(tokens[0]);
        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                if(s.equals("+")){
                    result = stack.pop() + stack.pop();
                    stack.push(result);
                }else if(s.equals("-")){ 
                    int b = stack.pop();
                    int a = stack.pop();
                    result = a-b;
                    stack.push(result);
                }else if(s.equals("*")){
                    result = stack.pop() * stack.pop();
                    stack.push(result);
                }else if(s.equals("/")){
                    int den = stack.pop();
                    int num = stack.pop();
                    if(den!=0) result = num / den;
                    stack.push(result);
                }
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return result;
    }
}
