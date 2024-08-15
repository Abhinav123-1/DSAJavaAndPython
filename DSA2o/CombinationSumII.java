package DSA2o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {

    }
}

class CombinationSumIISolution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        /*
         * Input: candidates = [10,1,2,7,6,1,5], target = 8
         * Output: [[1,1,6],[1,2,5], [1,7],[2,6]]
         * Sorting = [1,1,2,5,6,7,10]
         */
        Arrays.sort(candidates);
        List<Integer> candList = new ArrayList<>();
        List<List<Integer>> finaList = new ArrayList<>();
        int sum = 0;    

        for(int i=0; i<candidates.length;i++){
            sum+=candidates[i];
            if(sum>target){
                break;
            }
        



        }
        
        return null;
    }
}
