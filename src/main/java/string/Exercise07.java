package string;

public class Exercise07 {
    public String transToRootString(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int count = 0;
                while ((i + count < str.length()) && Character.isDigit(str.charAt(i + count)))
                    count++;
                for (int j = 0; j < Integer.parseInt(str.substring(i, i + count)); j++)
                    res.append(str.charAt(i - 1));
                i += count - 1;
            }
            else if (i == str.length() - 1) {
                res.append(str.charAt(i));
            }
            else if (!Character.isDigit(str.charAt(i + 1))) {
                res.append(str.charAt(i));
            }
        }

        return res.toString();
    }
}
