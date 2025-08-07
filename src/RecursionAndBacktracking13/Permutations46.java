package RecursionAndBacktracking13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations46 {
    List<List<Integer>> result = new ArrayList<>();


    public List<List<Integer>> permute(int[] nums) {
        List<Integer> inp = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            inp.add(nums[i]);

        createPermutations(inp, new ArrayList<Integer>());

        return result;
    }

    private void createPermutations(List<Integer> inp, List<Integer> outs) {
        //System.out.println("START: "+inp.toString()+" "+outs.toString()+" "+inp.isEmpty());
        if(inp.isEmpty()){
            result.add(new ArrayList<>(outs));
            //System.out.println("RESULT: "+ result.toString()+" : " + outs);
            return;
        }
        for(int i=0;i< inp.size();i++){
            outs.add(inp.get(0));
            int t = inp.remove(0);
            //System.out.println(inp.toString()+" "+outs.toString());
            createPermutations(inp,outs);
            inp.add(t);
            outs.remove(outs.size()-1);
        }
    }
}