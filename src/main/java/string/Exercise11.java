package string;

public class Exercise11 {
    public String subBigInteger(String a, String b) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        int miss = 0;
        int sub = 0;

        if (a.length() < b.length() || (a.length() == b.length() && a.compareTo(b) < 0)) {
            return "-" + subBigInteger(b,a);
        }

        while (count <= a.length()) {
            sub = digitFromRight(a, count) - digitFromRight(b, count) + miss;
            miss = sub < 0 ? -1 : 0;
            res.append(10 * -miss + sub);
            count++;
        }

        return standardizeNumber(res.reverse().toString());
    }

    private static int digitFromRight(String str, int right){
        if (str.length() - right < 0) return 0;
        return str.charAt(str.length() - right) - '0';
    }

    public String standardizeNumber(String str) {
        int i = 0;
        while(i < str.length() && str.charAt(i) == '0') i ++;
        return str.substring(i);
    }
}
