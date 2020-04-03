package string;

public class Exercise06 {
    public String shortenString(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i + count < str.length() && str.charAt(i + count) == str.charAt(i)) {
                count++;
            }

            if (count > 1) res.append(str.charAt(i) + "" + (count));
            else res.append(str.charAt(i) + "");
            i = i + count - 1;
        }
        return res.toString();
    }
}
