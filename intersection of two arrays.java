import java.util.Set;
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> interesection = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                interesection.add(nums1[i]);
                i ++;
                j ++;
            }
            else if(nums1[i] > nums2[j]) j++;
            else  i++;
        }
        int[] common_nums = new int[interesection.size()];
        int l = 0;
        for(int k: interesection){
            common_nums[l++] = k;
        }
        return common_nums;
    }
}