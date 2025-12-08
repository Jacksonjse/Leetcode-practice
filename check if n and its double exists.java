import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(seen.contains(arr[i]*2) || (arr[i]%2==0 && seen.contains(arr[i]/2))){
                return true;
            }
            seen.add(arr[i]);
        }
        return false;
    }
}