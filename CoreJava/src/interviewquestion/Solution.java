package interviewquestion;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

    
       int N = A.length;
       int j = 0;
       Set<Integer> set = new HashSet<>();
       for (int a : A) {
           if (a > 0) {
               set.add(a);
           }
       }
       for (int i = 1; i <= N + 1; i++) {
           if (!set.contains(i)) {
               j= i;
               break;
           }
       }
	return j;
       
      }
    
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	int[] test = {1,2,3};
    	int j =s.solution(test);
    	System.out.println(j);
    	
    }
}
