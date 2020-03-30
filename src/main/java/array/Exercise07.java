package array;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise07 {
    public List<Integer> findMaxAscSubArr(int[] arr) {

        int start = 0;
        int max = 1;
        int pos = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                if (i - start > max) {
                    max = i - start;
                    pos = start;
                }
                start = i;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = pos; i < pos + max; i++ )
            result.add(arr[i]);

        return result;
    }
}
