package string;

public class Exercise08 {
    public boolean checkBarcodeEAN13(String str) {
        if (str.length() != 13) return false;

        str += "0";
        int sum = 0;
        for (int i = 1; i < str.length(); i += 2)
            sum += str.charAt(i - 1) + 3 * str.charAt(i) - 4* '0';

        return sum % 10 == 0;
    }
}
