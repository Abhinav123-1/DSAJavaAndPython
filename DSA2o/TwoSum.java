package DSA2o;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        
    }
}

class TwoSumSolution{
    public int[] twoSum(int[] nums, int target) {
          int solution[] = {-1,-1};
          Map<Integer,Integer> sumMap = new HashMap<>();
          for(int i=0; i<nums.length;i++){
            int rem = target - nums[i];
            if(sumMap.containsKey(rem)){
                solution[0] = i;
                solution[1] = sumMap.get(rem);
            }
            sumMap.put(nums[i],i);
          } 
          return solution;
    }
}
