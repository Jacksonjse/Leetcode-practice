class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0 = 0;
        int count1 = 0;
        int eaten = 0;

        for(int i:students){
            if(i==0) count0++;
            else count1++;
        }

        for(int j:sandwiches){
            if(j==0 && count0>0){
                count0--;
                eaten++;
            } 
            else if(j==1 && count1>0){
                count1--;
                eaten++;
            }else break;
        }

        return students.length - eaten;
    }
}