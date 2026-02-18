import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> slidingWindow = new HashMap<>();
        int left = 0;
        int subLen = 0;

        for(int right = 0; right<s.length(); right++){
            char curr = s.charAt(right);

            if(slidingWindow.containsKey(curr)){
                left = Math.max(left, slidingWindow.get(curr) + 1);
            }

            slidingWindow.put(curr, right);
            subLen = Math.max(subLen, right - left + 1);
        }

        return subLen;
    }
}