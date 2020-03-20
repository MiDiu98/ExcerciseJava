package basic;

public class Exercise02 {
    public int calSumDigitsOfANumber(String num) {

        int sum = 0;

        for (int index = 0; index < num.length(); index++ ) {
            sum += (num.charAt(index) - '0');
        }

        return sum;
    }
}
