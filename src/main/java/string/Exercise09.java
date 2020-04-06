package string;

import java.util.ArrayList;
import java.util.List;

public class Exercise09 {
    public int findBarcodeEAN13(String str) {
            if (str.length() != 12) return -1;

            int sum = 0;
            for (int i = 1; i < str.length(); i += 2)
                sum += str.charAt(i - 1) + 3 * str.charAt(i) - 4* '0';

            return sum % 10 == 0 ? 0 : 10 - (sum % 10);
    }
}
