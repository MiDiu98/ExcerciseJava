package array;

public class Exercise02 {

    public int sumThreeNumLargest(int[] arr) {
        if (arr.length < 4) {
            int res = 0;
            for (int i : arr)
                res += i;

            return res;
        } else {
            int first = max(max(arr[0], arr[1]),arr[2]);
            int third = min( min(arr[0], arr[1]), arr[2]);;
            int second = arr[0] + arr[1] + arr[2] - first - third;

            for (int i = 2; i < arr.length; i++) {
                if (first < arr[i]) {
                    third = second;
                    second = first;
                    first = arr[i];
                } else if (second < arr[i]) {
                    third = second;
                    second = arr[i];
                } else if (third < arr[i]) {
                    third = arr[i];
                }
            }
            return first + second + third;
        }
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }
}
