package array;

public class Exercise05 {

    public int sumPrime(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res += checkPrime(i) ? i : 0;
        }
        return res;
    }

    public boolean checkPrime(int n) {
        if ( n < 2) return false;

        int i;
        for (i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
