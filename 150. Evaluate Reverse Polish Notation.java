class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        int b = 0;
        int a = 0;
        for(String s:tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                stack.push(Integer.parseInt(s));
                
            }
            else{
                b = stack.pop();
                a = stack.pop();
                switch(s){
                    case "+" -> stack.push(a+b);
                    case "-" -> stack.push(a-b);
                    case "*" -> stack.push(a*b);
                    case "/" -> stack.push(a/b);
                    
                }
            }
 
        }
        return stack.pop();
    }
}