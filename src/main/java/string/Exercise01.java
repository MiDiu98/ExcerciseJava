package string;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {

    public List<String> splitSentence(String a) {
        List<String> res = new ArrayList<String>();

        for(String w : a.split("[\\.\\?\\!\\n]")){
            System.out.println(w);
            res.add(w.trim());
        }
        return res;
    }
}
