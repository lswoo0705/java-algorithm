package programmers.programmers0.test_181to200;

import java.util.ArrayList;
import java.util.List;

public class Test_199_ZoomInPicture {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for (String s : picture) {
            String[] enlarge = s.split("");
            StringBuilder str = new StringBuilder();
            for (String value : enlarge) {
                str.append(value.repeat(k));
            }
            for (int j = 0; j < k; j++) {
                list.add(str.toString());
            }
        }
        return list.toArray(new String[0]);
    }
}
