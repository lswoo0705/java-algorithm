package algorithm.programmers0.test_161to180;

import java.util.Arrays;

public class Test_172_ThreeSeparators {
    public String[] solution(String myStr) {
        String newStr = myStr.replaceAll("[abc]", ",");
        
        String[] answer = Arrays.stream(newStr.split(","))
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        if (answer.length == 0) {
            answer = new String[]{"EMPTY"};
        }

        return answer;
    }
}
