package programmers.programmers0.test_161to180;

import java.util.HashMap;
import java.util.Map;

public class Test_175_StringBundling {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for (String str : strArr) {
            int length = str.length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }

        for (int n : map.values()) {
            answer = Math.max(answer, n);
        }

        return answer;
    }
}
