package basic;

public class Exercise17 {

    public double findSqrtByBisection(double num) {
        double left = 1;
        double right = num;

        while (right - left >= 0.0001) {
            double mid = (right + left) / 2;
            if (calF(num, left) * calF(num, mid) < 0) right = mid;
            else left = mid;
        }
        return left;
    }

    public double calF(double num, double x) {
        return num - x * x;
    }
}
