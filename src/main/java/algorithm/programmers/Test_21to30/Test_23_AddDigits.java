package algorithm.programmers.Test_21to30;

import java.util.stream.Stream;

public class Test_23_AddDigits {
    public int solution(int n) {
        int answer = 0;
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < digits.length; i++) {
            answer += digits[i];
        }
        return answer;
    }
}
