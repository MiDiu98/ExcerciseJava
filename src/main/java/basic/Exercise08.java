package basic;

public class Exercise08 {

    public String calPI() {
        int i = -1;
        int count = 3;
        float result = 4;

        while (Math.abs(Math.PI - result) > 0.0001) {
            result += i * 4.0f / count;
            i *= -1;
            count +=2;
        }

        return String.format("%.5f",result);
    }
}
