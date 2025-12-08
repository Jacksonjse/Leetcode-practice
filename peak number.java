import java.util.Map;
import java.util.HashMap;

class Solution {
    public int findPeakElement(int[] nums) {
        Map<Integer, Integer> peakMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            
            peakMap.put(nums[i], i);
        }
        Arrays.sort(nums);
        return peakMap.get(nums[nums.length-1]);
    }
}