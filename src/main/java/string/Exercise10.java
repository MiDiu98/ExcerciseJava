package string;

public class Exercise10 {
    public String sumBigInteger(String a, String b) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        int miss = 0;
        int sum = 0;

        while (count <= b.length() && count <= a.length()) {
            sum = miss + b.charAt(b.length() - count) + a.charAt(a.length() - count) - 2* '0';
            miss = sum > 9 ? 1 : 0;
            res.append(sum % 10);
            count++;
        }

        while (count <= a.length() || count <= b.length()) {
            sum = miss - '0' + (count <= a.length() ? a.charAt(a.length() - count) : b.charAt(b.length() - count));
            miss = sum > 9 ? 1 : 0;
            res.append(sum % 10);
            count++;
        }
        res = sum > 9 ? res.append("1") : res;

        return res.reverse().toString();
    }
}
