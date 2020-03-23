package basic;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercise05 {
    public String soluteQuadraticEquation(int a, int b, int c) {
        if (a == 0) {
            return "Error: Not is a quadratic equation";
        }

        int delta = b * b - 4 * a *c;

        if (delta < 0) {
            return "The equation has no real roots.";
        } else if (delta == 0) {
            float x = (-b) / (2 * a);
            return String.format("The root is x = %.2f", x);
        } else {
            float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            return String.format("The roots are x1 = %.2f and x2 = %.2f", x1, x2);
        }
    }
}
