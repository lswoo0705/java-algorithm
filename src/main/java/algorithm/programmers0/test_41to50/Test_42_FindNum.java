package algorithm.programmers0.test_41to50;

import java.util.stream.Stream;

public class Test_42_FindNum {
    public int solution(int num, int k) {
        int answer = 0;
        int[] digits = Stream.of(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == k) {
                answer = i + 1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}
