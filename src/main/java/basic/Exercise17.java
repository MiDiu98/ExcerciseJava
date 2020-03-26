package basic;

public class Exercise17 {

    public double findSqrtByBisection(double num) {
        double left = 0;
        double right = (num > 1) ? num : 1;

        while (right - left >= 0.000001) {
            double mid = (right + left) / 2;
            if (mid * mid > num) right = mid;
            else left = mid;
        }
        return left;
    }
}
