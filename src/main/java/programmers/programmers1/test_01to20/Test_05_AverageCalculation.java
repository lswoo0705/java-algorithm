package programmers.programmers1.test_01to20;

import java.util.Arrays;

public class Test_05_AverageCalculation {
    public double solution(int[] arr) {
        // for문으로 평균 구하기
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        double answer = (double) sum / arr.length;
//        return answer;

        // stream 사용하기
        double integerStream = Arrays.stream(arr).average().getAsDouble();
        return integerStream;
    }
}
