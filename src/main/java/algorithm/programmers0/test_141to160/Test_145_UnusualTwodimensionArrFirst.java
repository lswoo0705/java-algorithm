package algorithm.programmers0.test_141to160;

public class Test_145_UnusualTwodimensionArrFirst {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }

        return answer;
    }
}
