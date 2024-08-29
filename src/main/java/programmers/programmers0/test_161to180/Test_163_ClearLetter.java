package programmers.programmers0.test_161to180;

import java.util.Arrays;

public class Test_163_ClearLetter {
    public String solution(String my_string, int[] indices) {
        String answer;
        StringBuilder newString = new StringBuilder(my_string);
        int index = 0;
        Arrays.sort(indices);

        for (int j : indices) {
            newString.deleteCharAt(j - index);
            index++;
        }

        answer = String.valueOf(newString);

        return answer;
    }
}
