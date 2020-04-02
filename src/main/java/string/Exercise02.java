package string;

public class Exercise02 {
    public boolean checkReverse(String str) {
        StringBuilder s = new StringBuilder(str);
        return str.equals(s.reverse().toString());
    }
}
