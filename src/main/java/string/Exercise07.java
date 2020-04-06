package string;

public class Exercise07 {
    public String transToRootString(String str) {
        StringBuilder res = new StringBuilder();

        str = str + " ";

        char ch = '0';
        int count = -1;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                count = 10 * count + c - '0';
            }else{
                if(i > 0 && count == 0) count = 1;
                for(int j=0; j< count; j++)res.append(ch);
                ch = c;
                count = 0;
            }
        }

        return res.toString();
    }
}
