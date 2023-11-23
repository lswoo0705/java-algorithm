package algorithm.programmers1.test_41to60;

import java.util.Arrays;

public class Test_48_HallOfFame {
    public int[] solution(int k, int[] score) {
//        int[] answer = new int[score.length];
//        int[] fame = new int[k];
//        Arrays.fill(fame, 2000);
//        // 1 ~ k일차
//        for (int i = 0; i < k; i++) {
//            fame[i] = score[i];
//            Arrays.sort(fame);
//            answer[i] = fame[0];
//        }
//
//        // k + 1 ~ score.length일차
//        for (int i = k; i < score.length; i++) {
//            if (fame[0] < score[i]) {
//                fame[0] = score[i];
//                Arrays.sort(fame);
//            }
//            answer[i] = fame[0];
//        }
//        return answer;

        int n = Math.min(k, score.length);
        int[] answer = new int[score.length];
        int[] fame = new int[n];
        Arrays.fill(fame, 2000);

        // 1 ~ n일차
        for (int i = 0; i < n; i++) {
            fame[i] = score[i];
            Arrays.sort(fame);
            answer[i] = fame[0];
        }

        // n + 1 ~ score.length일차
        for (int i = n; i < score.length; i++) {
            if (fame[0] < score[i]) {
                fame[0] = score[i];
                Arrays.sort(fame);
            }
            answer[i] = fame[0];
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_48_HallOfFame sol = new Test_48_HallOfFame();
        // 테스트 케이스 1
//        int k = 9; int[] score = {10, 30, 40, 3, 0, 20, 4};
        // 결과값 : [10, 10, 10, 3, 0, 0, 0]

        // 테스트 케이스 2
        int k = 3; int[] score = {10, 100, 20, 150, 1, 100, 200};
        // 결과값 : [10, 10, 10, 20, 20, 100, 100]
        System.out.println(Arrays.toString(sol.solution(k, score)));
    }
}
