package basic;

public class Exercise12 {

    public double findSquareRoot(double num) {
        double guess = num;
        while (Math.abs(guess * guess - num) / num >= 0.0001)
            guess = num / (2 * guess) + guess / 2;
        return guess;
    }
}
