class Solution {
    public void reverseString(char[] s) {
        for(int i=0, k=s.length-1; k>i; i++, k--){
            char temp = s[i];
            s[i] = s[k];
            s[k] = temp;
        }
    }
}