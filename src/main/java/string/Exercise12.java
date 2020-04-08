package string;

public class Exercise12 {
    public String makeMaxNum(int[] a) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < a.length - 1; i++ ){
            for (int j = i + 1; j < a.length; j++) {
                String s1 = Integer.toString(a[i]);
                String s2 = Integer.toString(a[j]);
                if (Integer.parseInt(s1 + s2) < Integer.parseInt(s2 + s1)) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i : a) {
            res.append(i);
        }
        return res.toString();
    }
}
