import AdvancedArraysAndStrings4.SetMatrixZeroes73;
import AdvancedArraysAndStrings5.IndexOfFirstOccurence28;
import AdvancedArraysAndStrings5.LongestCommonPrefix14;
import AdvancedArraysAndStrings5.LongestPalindromicSubstring5;
import AdvancedArraysAndStrings6.Search2dMatrixII240;
import AdvancedArraysAndStrings6.SpiralMatrix54;
import AdvancedArraysAndStrings6.WordSearch79;
import AdvancedLinkedListsAndCycles10.LinkedListCycleII142;
import AdvancedLinkedListsAndCycles10.ReverseNodesInKGroup25;
import LinkedList9.ListNode;
import LinkedList9.RemoveNthNodeFromTheList19;
import StacksAndQueueImplementation11.RottingOranges994;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RottingOranges994 r = new RottingOranges994();
        int[][] matrix = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println("Time: "+r.orangesRotting(matrix));
    }
}