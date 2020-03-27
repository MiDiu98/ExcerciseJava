package array;

import java.util.Arrays;
import java.util.Collections;

public class Exercise04 {

    public String sortSeparateEvenOdd(Integer[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int cEven = 0;
        StringBuilder res = new StringBuilder();

        while ( l != r) {
            while (arr[l] % 2 == 0) {
                l++;
                cEven++;
            }

            while ((arr[r] % 2 != 0) && (l < r)) {
                r--;
            }
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }

        Arrays.sort(arr, 0, cEven);
        Arrays.sort(arr, cEven, arr.length, Collections.reverseOrder());

        for (int i : arr)
            res.append(i + " ");

        return res.toString();
    }
}
