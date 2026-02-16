class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x/2;

        if(x==1) return 1;

        while(l<=r){

            int m = (l+r)/2;
            long mSquared = (long) m*m;

            if(mSquared == x){
                return m;
            }
            else if(mSquared < x){
                l = m + 1;
            }
            else{
                r = m - 1;
            }
        }

        return r;
    }
}