package programmers.programmers0.test_181to200;

public class Test_196_MakeItSquare {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // 행과 열 중 더 큰 값을 기준으로
        int maxSize = Math.max(rows, cols);

        int[][] answer = new int[maxSize][maxSize];

        // 기존 배열을 복사
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
