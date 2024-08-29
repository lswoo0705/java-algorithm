package programmers.programmers0.test_31to40;

import java.util.Arrays;

public class Test_34_SortString {
    public int[] solution(String my_string) {
        String intString = my_string.replaceAll("[^0-9]", "");

        int[] answer = new int[intString.length()];

        for (int i = 0; i < intString.length(); i++) {
            answer[i] = Integer.parseInt(intString.substring(i, 1 + i));
        }
        Arrays.sort(answer);
        return answer;
    }
}
