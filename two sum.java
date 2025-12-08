import java.util.HashMap;
import java.util.Map;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int req = target - nums[i];
            if (numsMap.containsKey(req)){
                return new int[]{numsMap.get(req), i};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }
}