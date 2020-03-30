package array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Exercise06 {

    public String sortNotChangePositionEvenOdd(int[] arr) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % 2 == 0){
                    if ((arr[i] % 2 == 0) == (arr[i] > arr[j])) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        for (int i = 0; i < arr.length; i++)
            res.append(arr[i] + " ");

        return res.toString();
    }
}
