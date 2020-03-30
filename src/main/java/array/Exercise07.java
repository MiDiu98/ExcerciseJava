package array;

public class Exercise07 {
    public String findMaxAscSubArr(int[] arr) {
        StringBuilder res = new StringBuilder();
        int start = 0;
        int max = 1;
        int pos = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] <= arr[i]) {
                continue;
            } else {
                if (i - start > max) {
                    max = i - start;
                    pos = start;
                }
                start = i;
            }
        }

        for (int i = pos; i < pos + max; i++ )
            res.append(arr[i] + " ");

        return res.toString();
    }
}
