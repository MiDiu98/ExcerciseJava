package basic;

public class Exercise04 {

    public String findFibonacciSequence(int num) {
        if (num < 2) {
            return "";
        } else {
            String result = "";

            int fibo1 = 1;
            int fibo2 = 1;
            int fibo3 = fibo1 + fibo2;

            result += "" + fibo1;

            while (fibo3 <= num) {
                result += " " + fibo2;
                fibo3 = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = fibo3;
            }
            return result;
        }
    }

}
