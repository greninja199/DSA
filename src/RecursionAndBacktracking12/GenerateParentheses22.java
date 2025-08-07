package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    List<String> parenList = new ArrayList<>();

    public void genParen(int n, int l, int r, String s) {
        if (l == r && l == n)
            parenList.add(s);
        if (l < n)
            genParen(n, l + 1, r, s + "(");
        if (l > r)
            genParen(n, l, r + 1, s + ")");
    }

    public List<String> generateParenthesis(int n) {
        genParen(n, 0, 0, "");
        return parenList;
    }
}
