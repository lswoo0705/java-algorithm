package programmers.programmers0.test_181to200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_187_LeftRight {
    public String[] solution(String[] str_list) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                result.addAll(Arrays.asList(str_list).subList(0, i));
                break;
            } else if (str_list[i].equals("r")) {
                result.addAll(Arrays.asList(str_list).subList(i + 1, str_list.length));
                break;
            }
        }

        return result.toArray(new String[0]);
    }
}
