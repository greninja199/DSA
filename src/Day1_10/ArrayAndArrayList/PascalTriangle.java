package Day1_10.ArrayAndArrayList;
import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> generate(int numOfRows){
        List<List<Integer>> values = new ArrayList<>();
        for(int i=0;i<numOfRows;i++){
            List<Integer> rowValue = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    rowValue.add(1);
                else{
                    rowValue.add(values.get(i-1).get(j-1)+values.get(i-1).get(j));
                }
            }
            values.add(rowValue);
        }

        return values;
    }
}
