package basic;

public class Exercise16 {

    public int countFibo(int num) {
        if (num < 1) return 0;

        int fibo1 = 1;
        int fibo2 = 1;
        int fibo3 = fibo1 + fibo2;

        int count = 2;
        while (fibo3 <= num) {
            count++;
            fibo1 = fibo2;
            fibo2 = fibo3;
            fibo3 = fibo1 + fibo2;
        }

        return count;
    }
}
