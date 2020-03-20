package basic;

public class Exercise01 {

    /* find greatest common divisor */
    public int findGCD(int a, int b) {

        if ((a == 0) && (b == 0)) {
            return -1;
        }

        while (a * b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a + b;
    }


    public int findLCM(int a, int b) {

        return (findGCD(a, b) <= 0) ? 0 : (a * b / findGCD(a, b));
    }
}
