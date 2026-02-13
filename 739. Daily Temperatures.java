class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] op = new int[temperatures.length];

        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && (temperatures[i] > temperatures[stack.peek()])){
                op[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return op;
    }
}