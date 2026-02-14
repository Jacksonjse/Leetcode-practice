class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> st = new ArrayDeque<>();
        int maxArea = 0;

        for(int i=0; i<=heights.length; i++){
            int currHeight = (i==heights.length) ? 0 : heights[i];

            while(!st.isEmpty() && currHeight < heights[st.peek()]){
                int ht = heights[st.pop()];
                int wd = st.isEmpty() ? i: i - st.peek() - 1;

                maxArea = Math.max(ht * wd, maxArea);
            }

            st.push(i);
        }

        return maxArea;
    }
}