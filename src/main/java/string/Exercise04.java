package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise04 {
    public boolean checkRepeatOneString(String str) {
        if (str.length() < 2) return false;

        Set<String> set = new HashSet<String>(Arrays.asList(str.split(str.charAt(0) + "+")));
        int count = 0;

        for (String w : set) {
            if (!w.equals("")) count++;
        }

        return count <= 1;
    }
}
