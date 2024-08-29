package programmers.programmers0.test_141to160;

import java.util.ArrayList;
import java.util.List;

public class Test_141_RemoveAd {
    public String[] solution(String[] strArr) {
        List<String> strList = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                strList.add(s);
            }
        }

        return strList.toArray(new String[strList.size()]);
    }
}
