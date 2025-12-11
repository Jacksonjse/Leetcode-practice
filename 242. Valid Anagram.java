import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        else{
            char[] sChar = s.toCharArray();
            char[] tChar = t.toCharArray();

            Arrays.sort(sChar);
            Arrays.sort(tChar);

            return Arrays.equals(sChar, tChar);
            }
        
    }
}