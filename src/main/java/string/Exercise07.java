package string;

public class Exercise07 {
    public String transToRootString(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (isNum(str.charAt(i))) {
                int end = 0;
                while ((i + end < str.length()) && isNum(str.charAt(i + end)))
                    end++;
                for (int j = 0; j < Integer.parseInt(str.substring(i, i + end)); j++)
                    res.append(str.charAt(i - 1));
                i += end - 1;
            }
            else if (i == str.length() - 1) {
                res.append(str.charAt(i));
            }
            else if (!isNum(str.charAt(i + 1))) {
                res.append(str.charAt(i));
            }
        }

        return res.toString();
    }
    public boolean isNum(char c) {
        return c > '0' && c < '9';
    }
}
