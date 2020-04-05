package string;

import java.util.*;

public class Exercise05 {
    public List<String> findSubStringRepeat(String str) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> res = new ArrayList<String>();

        for (String w : str.split("\\s+")) {
            if (map.containsKey(w)) map.put(w, map.get(w) + 1);
            else map.put(w, 1);
        }

        Set<String> set = map.keySet();
        for (String key : set) {
            if (map.get(key) > 1) res.add(key);
        }
        return res;
    }
}
