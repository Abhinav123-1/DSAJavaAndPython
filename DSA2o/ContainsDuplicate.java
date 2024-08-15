package DSA2o;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        
    }
}

class ContainsDuplicateSolution{
    public boolean containsDuplicate(int[] nums) {

        Map<Integer,Integer> dupMap =  new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(dupMap.containsKey(nums[i])){
               return true;
            }
            dupMap.put(nums[i], 1);
        } 
        return false;
     
    }
}
