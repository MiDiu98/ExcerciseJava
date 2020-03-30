package array;

import java.util.Arrays;

public class Exercise09 {

    public int searchBinary(int[] arr, int num) {
        int l = 0;
        int r = arr.length;

        while (r - l > 1) {
            int mid = (l + r) / 2;
            if (num == arr[mid]) return mid;
            if (num < arr[mid]) r = mid;
            else l = mid;
        }
        return num == arr[l] ? l : -1;
    }
}
