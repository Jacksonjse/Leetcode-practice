class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();
        if(s.length()%2 != 0) return false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') stck.push(s.charAt(i));
            
            else if(s.charAt(i) == ')'){
                if(!stck.isEmpty()){
                    if(stck.peek() == '(') stck.pop();
                    else return false;
                    
                }else stck.push(s.charAt(i));
            }
            else if(s.charAt(i) == '}'){
                if(!stck.isEmpty()){
                    if(stck.peek() == '{') stck.pop();
                    else return false;
                    
                }else stck.push(s.charAt(i));
                
            }
            else if(s.charAt(i) == ']'){
                if(!stck.isEmpty()){
                    if(stck.peek() == '[') stck.pop();
                    else return false;
                    
                } else stck.push(s.charAt(i));
            }
        }
        if(stck.isEmpty()) return true;
        return false;
    }
}