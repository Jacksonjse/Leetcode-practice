class Solution {
    public int arraySign(int[] nums) {
        return signFunc(nums);
    }

    static int signFunc(int[] product){
        int sign = 1;
        for(int x:product){
            if(x == 0){
                return 0;
            }
            else if(x < 0){
                sign = -sign;
            }
        }
        return sign;
    }
}
