package string;

public class Exercise11 {
    public String subBigInteger(String a, String b) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        int miss = 0;
        int sub = 0;
        boolean sign = true;
        if (a.length() < b.length() || (a.length() == b.length() && a.charAt(0) < b.charAt(0))) {
            String temp = a;
            a = b;
            b = temp;
            sign = false;
        }

        while (count <= a.length()) {
            sub = digitFromRight(a, count) - digitFromRight(b, count) + miss;
            miss = sub < 0 ? -1 : 0;
            res.append(10 * -miss + sub);
            count++;
        }

        for (int i = res.length() - 1; i > 0; i--) {
            if (res.charAt(i) != '0') break;
            else res.deleteCharAt(i);
        }
        if (!sign) res.append('-');
        return res.reverse().toString();
    }
    private static int digitFromRight(String str, int right){
        if (str.length() - right < 0) return 0;
        return str.charAt(str.length() - right) - '0';
    }
}
