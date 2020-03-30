package array;

import java.util.Arrays;
import java.util.Collections;

public class Exercise04 {

    public String sortSeparateEvenOdd(Integer[] arr) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(arr, 0, arr.length);

        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0) res.append(arr[i] + " ");
        for (int i = arr.length - 1 ; i > 0; i--)
            if (arr[i] % 2 != 0) res.append(arr[i] + " ");

        return res.toString();
    }
}
