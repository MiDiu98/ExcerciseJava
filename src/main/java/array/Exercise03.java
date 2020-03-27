package array;

public class Exercise03 {
    public int subEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i : arr) {
            if (i % 2 == 0) even += i;
            else odd += i;
        }

        return even - odd;
    }
}
