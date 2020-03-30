package array;

import java.util.ArrayList;
import java.util.List;

public class Exercise10 {
    public List<Integer> insertToAscArr(int[] arr, int num) {
        List<Integer> res = new ArrayList<>();

        int i;
        for (i = 0; i < arr.length; i++) {
            if (num < arr[i]) break;
            res.add(arr[i]);
        }
        res.add(num);
        for (; i < arr.length; i++)
            res.add(arr[i]);

        return res;
    }
}
