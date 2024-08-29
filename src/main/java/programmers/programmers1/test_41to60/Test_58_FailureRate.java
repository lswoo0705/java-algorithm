package programmers.programmers1.test_41to60;

import java.util.Arrays;

public class Test_58_FailureRate {
    public int[] solution(int N, int[] stages) {
        double[] failureRate = new double[N]; // 스테이지의 실패율
        int[] answer = new int[N]; // 스테이지 실패율 순위

        // 스테이지별 실패율 계산
        for (int i = 0; i < N; i++) {
            // 스테이지에 도달한 플레이어 수 구하기
            int player = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i + 1) {
                    player++;
                }
            }

            // 스테이지에 도달했지만 못 깬 플레이어 수 구하기
            int failPlayer = 0;
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    failPlayer++;
                }
            }

            // 스테이지 실패율 구하고, 도달한 사람이 없다면 0
            failureRate[i] = (player == 0) ? 0 : (double) failPlayer / player;
        }

        for (int i = 0; i < N; i++) {
            answer[i] = i + 1;
        }

        // 실패율을 기준으로 내림차순 정렬
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                // 실패율이 같다면 스테이지 번호 오름차순으로 정렬
                if (failureRate[i] < failureRate[j] || (failureRate[i] == failureRate[j] && answer[i] > answer[j])) {
                    double tempRate = failureRate[i];
                    failureRate[i] = failureRate[j];
                    failureRate[j] = tempRate;

                    int tempAnswer = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tempAnswer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_58_FailureRate sol = new Test_58_FailureRate();
//        int N = 5; int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int N = 4; int[] stages = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(sol.solution(N, stages)));

    }
}
