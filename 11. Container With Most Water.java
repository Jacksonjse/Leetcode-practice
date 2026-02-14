class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;

        while(l < r){
            int ht = Math.min(height[l], height[r]);
            int wd = r - l;
            int area = ht * wd;
            maxArea = Math.max(area, maxArea);

            if(height[r] > height[l]) l++;
            else r--;
        }

        return maxArea;
    }
}