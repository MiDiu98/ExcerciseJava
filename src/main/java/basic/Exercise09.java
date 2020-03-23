package basic;

public class Exercise09 {

    public String calPI() {
        int temp = 1;
        int i = 2;
        float result = 3;
        float add = 1;

        while (Math.abs(add) >= 0.00001) {
            add = temp * 4.0f / (i * (i + 1) * (i +2));
            result += add;
            temp = -temp;
            i += 2;
        }

        return String.format("%.6f",result);
    }
}
