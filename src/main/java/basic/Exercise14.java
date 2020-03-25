package basic;

public class Exercise14 {
    public String findNum() {
        StringBuilder result = new StringBuilder("");
        int begin = 1;

        for (int m = 2; m < 6; m++) {
            begin *= 10;
            for (int i = begin; i < (begin * 10); i++) {
                if (transform(i, m) == i) result.append(i + " ");
            }
        }
        return result.toString();
    }

    public int pow(int x, int n) {
        int result = 1;

        for (int i = 0; i < n; i++) result *= x;
        return result;
    }

    public int transform(int num, int m) {
        int checkNum = 0;

        while (num > 0) {
            checkNum += pow(num % 10, m);
            num /= 10;
        }
        return checkNum;
    }
}
