package basic;

public class Exercise03 {

    public String analysisPrimeFactor(int num) {
        if (num <= 1) {
            return "";
        } else {
            StringBuilder result = new StringBuilder();
            int div = 2;

            while (num != div) {
                if (num % div == 0) {
                    result.append(div + " * ");
                    num /= div;
                } else {
                    div++;
                }
            }
            result.append(div);
            return result.toString();
        }
    }
}
