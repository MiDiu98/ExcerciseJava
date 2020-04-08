package string;

public class Exercise09 {
    public int findBarcodeEAN13(String str) {
            if (str.length() != 12) return -1;

            int sum = 0;
            for (int i = 1; i < str.length(); i += 2)
                sum += str.charAt(i - 1) + 3 * str.charAt(i) - 4* '0';

            return (10 - sum % 10) % 10;
    }
}
