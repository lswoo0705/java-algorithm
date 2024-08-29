package programmers.programmers1.test_41to60;

import java.util.Arrays;

public class Test_52_FruitVendor {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] reverseScore = new int[score.length];

        Arrays.sort(score);
        for (int i = score.length - 1, j = 0; i >= 0; i--, j++) {
            reverseScore[j] = score[i];
        }

        for (int i = 1; i <= score.length / m; i++) {
            answer += reverseScore[i * m - 1] * m;
        }

        return answer;
    }
}
