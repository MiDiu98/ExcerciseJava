package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise13 {

    public List<List<Integer>> deleteRowColOfMatrix(int[][] a, int row, int col) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < a.length; i++) {
            if (row != i) {
                ArrayList<Integer> r = new ArrayList<>();
                for (int j = 0; j < a[0].length; j++)
                    if (j != col) r.add(a[i][j]);
                res.add(r);
            }
        }
        return res;
    }
}
