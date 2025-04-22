package programmers.programmers2.test_81to100;

import java.util.ArrayList;
import java.util.List;

public class Test_84_HailSequenceDefiniteIntegral { // 우박수열 정적분
    public double[] solution(int k, int[][] ranges) {
        // 1.콜라츠 수열을 구하기
        List<Integer> collatz = new ArrayList<>();
        while (k != 1) {
            collatz.add(k);
            k = (k % 2 == 0) ? k / 2 : k * 3 + 1;
        }
        collatz.add(1); // 마지막 값인 1을 추가

        int n = collatz.size() - 1; // 선분 개수

        // 2.구간별 면적을 미리 구해놓기(사다리꼴 넓이 저장)
        double[] areas = new double[n];
        for (int i = 0; i < n; i++) {
            areas[i] = (collatz.get(i) + collatz.get(i + 1)) / 2.0;
        }

        // 3.각 구간별 면적 값을 구하기
        double[] answer = new double[ranges.length];
        for (int i = 0; i < ranges.length; i++) {
            int a = ranges[i][0];
            int b = ranges[i][1];
            int end = n + b;

            // 유효하지 않은 구간
            if (a > end) {
                answer[i] = -1.0;
                continue;
            }

            double sum = 0;
            for (int j = a; j < end; j++) {
                sum += areas[j];
            }
            answer[i] = sum;
        }

        return answer;
    }
}
