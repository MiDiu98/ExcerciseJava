package array;

public class Exercise11 {

    public int sumMaxSubArr(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sum += arr[i];
            } else {
                max = sum > max ? sum : max;
                sum = 0;
            }
        }
        return max;
    }
}
