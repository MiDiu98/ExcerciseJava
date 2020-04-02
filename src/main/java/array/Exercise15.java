package array;

import java.util.*;

public class Exercise15 {
    public List<Integer> findNMax(int[] a, int k) {
        List<Integer> res = new ArrayList<Integer>();

        Arrays.sort(a);
        if (k > a.length) {
            for (int i = a.length - 1; i >= 0; i--)
                res.add(a[i]);
        } else {
            for (int i = a.length - 1; i >= a.length - k; i--)
                res.add(a[i]);
        }
        return res;
    }
}
