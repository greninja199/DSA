package Day1_10.BitwiseManipulation7;

public class NumberOf1Bits191 {
    public int hammingWeight(int n) {
        int counter = 0;
        for(int i=0;i<31;i++)
            if((n>>i)%2!=0)
                counter++;
        return counter;
    }
}
