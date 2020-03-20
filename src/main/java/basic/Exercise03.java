package basic;

public class Exercise03 {

    public static String analysisPrimeFactor(int num) {
        if (num <= 1) {
            return "";
        } else if ((num == 2) || (num == 3) || (num == 5) || (num == 7)){
            return num + "";
        } else {
            String result = "";
            int div = 2;

            while (num != div) {
                if (num % div == 0) {
                    result += div + " * " ;
                    num /= div;
                } else {
                    div++;
                }
            }
            result += "" + div;
            return result;
        }
    }
}
