package array;

import java.util.LinkedHashMap;
import java.util.Map;


public class Exercise01 {
    public String findElementsRepeat(int[] arr) {
        StringBuilder res = new StringBuilder();

        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        for (int e : arr) {
            if (map.containsKey(e)) {
                map.put(e, map.get(e) + 1);
            } else {
                map.put(e, 1);
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                res.append(e.getKey() + " ");
            }
        }
        return res.toString();
    }
}
