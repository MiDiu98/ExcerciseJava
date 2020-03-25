package basic;

public class Exercise15 {

    public int findNumBit(int num) {
        StringBuilder result = new StringBuilder("");

        while (num > 0) {
            result.append(num % 2);
            num /= 2;
        }
        return Integer.parseInt(result.toString(), 2);
    }
}
