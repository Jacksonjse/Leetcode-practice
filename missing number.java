class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1)/2);
        int n_sum = 0;
        for(int x:nums){
            n_sum += x;
        }
        return sum - n_sum;
    }
}