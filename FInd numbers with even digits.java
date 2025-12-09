class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int i=0; i<nums.length; i++){
            int digitCount = 0;
            int digit = nums[i];
            while(digit > 0){
                digit = digit/10;
                digitCount ++;
            }
            if (digitCount % 2 == 0){
                evenCount ++;
            }
        }
        return evenCount;
    }
}