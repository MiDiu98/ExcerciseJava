package basic;

public class Exercise18 {

    public int transRomanNumToDecimal(String rNum) {
        if (rNum.length() == 0) return 0;

        int res = value(rNum.charAt(rNum.length() - 1));

        for (int i = rNum.length() - 2; i >= 0; i-- ) {
            int add = value(rNum.charAt(i));
            if (add == 0) return -1;
            res = res + (add < value(rNum.charAt(i+1))?-add:+add);
        }
        return res;
    }

    public int value(char r) {
            if (r == 'I')
                return 1;
            if (r == 'V')
                return 5;
            if (r == 'X')
                return 10;
            if (r == 'L')
                return 50;
            if (r == 'C')
                return 100;
            if (r == 'D')
                return 500;
            if (r == 'M')
                return 1000;
            return 0;
    }
}
