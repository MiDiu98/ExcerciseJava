package basic;

public class Exercise08 {

    public String calPI() {
        int i = -1;
        int count = 3;
        float result = 4;
        float add = i * 4.0f / count;

        while (Math.abs(add) >= 0.0001) {
            result += add;
            i = -i;
            count += 2;
            add = i * 4.0f / count;
        }

        return String.format("%.5f",result);
    }
}
