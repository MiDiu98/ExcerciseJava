package basic;

public class Exercise19 {

    public String transRomanNumToDecimal(int num) {
        int[] Decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] RomanNum = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        StringBuilder res = new StringBuilder();

        while (num > 0) {
            while (num / Decimal[i] > 0) {
                res.append(RomanNum[i]);
                num -= Decimal[i];
            }
            i++;
        }
        return res.toString();
    }
}
