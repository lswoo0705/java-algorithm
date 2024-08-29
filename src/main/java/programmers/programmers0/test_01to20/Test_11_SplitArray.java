package programmers.programmers0.test_01to20;

import java.util.Arrays;

public class Test_11_SplitArray {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer;
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);


        return answer;
    }
}
