package RecursionAndBacktracking13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum39 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        genCombinationSum(candidates,target, 0,new ArrayList<Integer>());

        return result;
    }

    private void genCombinationSum(int[] candidates, int target, int index, List<Integer> combs) {
        if(target==0){
            result.add(new ArrayList<>(combs));
            return;
        }
        if(target<0)
            return;
        for(int i=index;i<candidates.length;i++){
            combs.add(candidates[i]);
            genCombinationSum(candidates,target-candidates[i],i,combs);
            combs.remove(combs.size()-1);
        }
    }

}
