package string;

public class Exercise10 {
    public String sumBigInteger(String a, String b) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        int miss = 0;
        int sum = 0;
        int length = Math.max(a.length(), b.length());

        while(count <= length) {
            sum = miss + digitFromRight(a, count) + digitFromRight(b, count);
            miss = sum / 10;
            res.append(sum % 10);
            count++;
        }
        res = sum > 9 ? res.append("1") : res;

        return res.reverse().toString();
    }

    private static int digitFromRight(String str, int right){
        if (str.length() - right < 0) return 0;
        return str.charAt(str.length() - right) - '0';
    }
}
