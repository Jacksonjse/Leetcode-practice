class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> common = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    if(!common.contains(nums1[i])){
                        common.add(nums1[i]);
                    }
                }
            }
        }
        
        int[] elms = new int[common.size()];
        int index = 0;
        for(int i:common){
            elms[index] = i;
            index++; 
        }
        return elms;
    }
}