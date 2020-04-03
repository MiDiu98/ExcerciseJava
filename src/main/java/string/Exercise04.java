package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercise04 {
    public boolean checkRepeatOneString(String str) {
        if (str.length() < 2) return false;

        Set<String> set = new HashSet<String>();
        for (String w : str.split(str.charAt(0) + "+")) {
            set.add(w);
        }

        Iterator<String> iterator = set.iterator();
        int count = 0;

        while (iterator.hasNext()) {
            if (count > 1) return false;
            String subStr = iterator.next();
            if (!subStr.equals("")) count++;
        }
        return count > 1 ? false : true;
    }
}
