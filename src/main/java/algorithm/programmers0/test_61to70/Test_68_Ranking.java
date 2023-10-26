package algorithm.programmers0.test_61to70;

import java.util.Arrays;

public class Test_68_Ranking {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length];

        for (int i = 0; i < score.length; i++) {
            int english = score[i][0];
            int math = score[i][1];
            int sum = english + math;
            average[i] = (double) sum / 2;

            answer[i] = average.length + 1;
        }

        for (int i = 0; i < average.length; i++) {
            for (int j = 0; j < average.length; j++) {
                if (average[i] >= average[j]) {
                    answer[i] -= 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_68_Ranking sol = new Test_68_Ranking();
//        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
//        int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[][] score = {{1, 2}, {1, 1}, {1, 1}}; // [1, 2, 2]
                System.out.println(Arrays.toString(sol.solution(score)));
    }
}
