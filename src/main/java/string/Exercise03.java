package string;

public class Exercise03 {
    public int sumNumOfString(String str) {
        int res = 0;

        for (String w : str.split("[^0-9]+")) {
            if (!w.equals("")) res += Integer.parseInt(w);
        }
        return res;
    }
}
