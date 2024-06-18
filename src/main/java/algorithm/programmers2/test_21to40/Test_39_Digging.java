package algorithm.programmers2.test_21to40;

// 땅파먹기
public class Test_39_Digging {
    int solution(int[][] land) {
        // 동적 계획법(Dynamic Programming)
        int n = land.length;
        int[][] dig = new int[n][4];

        System.arraycopy(land[0], 0, dig[0], 0, 4);

        // 두 번째 행부터 점수를 더하기
        for (int i = 1; i < n; i++) {
            dig[i][0] = land[i][0] + Math.max(Math.max(dig[i - 1][1], dig[i - 1][2]), dig[i - 1][3]);
            dig[i][1] = land[i][1] + Math.max(Math.max(dig[i - 1][0], dig[i - 1][2]), dig[i - 1][3]);
            dig[i][2] = land[i][2] + Math.max(Math.max(dig[i - 1][0], dig[i - 1][1]), dig[i - 1][3]);
            dig[i][3] = land[i][3] + Math.max(Math.max(dig[i - 1][0], dig[i - 1][1]), dig[i - 1][2]);
        }

        // 마지막 행에서 최대값을 찾기
        return Math.max(Math.max(dig[n - 1][0], dig[n - 1][1]), Math.max(dig[n - 1][2], dig[n - 1][3]));
    }
}
