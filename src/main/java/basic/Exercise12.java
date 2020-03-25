package basic;

public class Exercise12 {

    public float findSquareRoot(float num) {
        float guess = num;
        while (Math.abs(guess * guess - num) / num >= 0.0001f)
            guess = num / (2 * guess) + guess / 2;
        return guess;
    }
}
