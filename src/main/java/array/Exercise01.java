package array;

import java.util.LinkedHashMap;
import java.util.Map;


public class Exercise01 {
    public String findElementsRepeat(int[] arr) {
        StringBuilder res = new StringBuilder();

        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            try {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            catch (Exception e) {
                map.put(arr[i], 1);
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
