package algorithm.programmers0.test_141to160;

import java.util.Arrays;

public class Test_149_SuffixArr {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
