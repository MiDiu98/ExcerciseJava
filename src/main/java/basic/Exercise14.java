package basic;

public class Exercise14 {

    public String findNum() {
        StringBuilder result = new StringBuilder("");
        int begin = 1;

        for (int m = 2; m < 6; m++) {
            begin *= 10;
            for (int i = begin; i < (begin * 10); i++) {
                if (cal(i, m)) result.append(i + " ");
            }
        }
        return result.toString();
    }

    public boolean cal(int i, int m) {
        int tempN = i;
        int checkNum = 0;

        while (tempN > 0) {
            checkNum += (int) Math.pow(tempN % 10 * 1.0, m * 1.0);
            tempN /= 10;
        }
        return checkNum == i;
    }
}
