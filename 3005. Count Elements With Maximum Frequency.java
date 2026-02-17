import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = 0;
        int cnt = 0;

        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hashmap.containsKey(nums[i])){
                hashmap.put(nums[i], hashmap.get(nums[i])+1);
                if (maxFreq < hashmap.get(nums[i])){
                    maxFreq = hashmap.get(nums[i]);
                }
            }
            else{
                hashmap.put(nums[i], 1);
            }
        }

        for(int i=0; i<nums.length; i++){
            if(hashmap.get(nums[i]) >= maxFreq) cnt++;
        }

        return cnt;
    }
}