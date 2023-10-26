package algorithm.programmers0.test_41to50;

import java.util.Arrays;

public class Test_47_AtoB {
    public int solution(String before, String after) {
        int answer = 0;
        char[] arrBefore = before.toCharArray();
        char[] arrAfter = after.toCharArray();
        Arrays.sort(arrBefore);
        Arrays.sort(arrAfter);
        String toStringBefore = Arrays.toString(arrBefore);
        String toStringAfter = Arrays.toString(arrAfter);
        if (toStringBefore.equals(toStringAfter)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
