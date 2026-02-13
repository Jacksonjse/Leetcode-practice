class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] op = new int[nums.length];
        Arrays.fill(op, -1);
        
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<2*nums.length; i++){
            int index = i%nums.length; 
            while(!stack.isEmpty() && (nums[index] > nums[stack.peek()])){
               op[stack.peek()] = nums[index];
                stack.pop();
            }
            stack.push(index);
        }
        
        return op;
    }
}