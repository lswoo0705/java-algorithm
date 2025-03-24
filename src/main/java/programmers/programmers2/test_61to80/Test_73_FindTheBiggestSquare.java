package programmers.programmers2.test_61to80;

public class Test_73_FindTheBiggestSquare {
    public int solution(int[][] board) {
        int maxSide = 0;
        int rows = board.length;
        int cols = board[0].length;
        int[][] table = new int[rows][cols];

        // 첫 행과 첫 열 초기화
        for (int i = 0; i < rows; i++) {
            table[i][0] = board[i][0];
            maxSide = Math.max(maxSide, table[i][0]);
        }
        for (int j = 0; j < cols; j++) {
            table[0][j] = board[0][j];
            maxSide = Math.max(maxSide, table[0][j]);
        }

        // 테이블 채우기
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (board[i][j] == 1) {
                    table[i][j] = Math.min(table[i-1][j], Math.min(table[i][j-1], table[i-1][j-1])) + 1;
                    maxSide = Math.max(maxSide, table[i][j]);
                }
            }
        }

        // 가장 큰 정사각형의 넓이 반환
        return maxSide * maxSide;
    }
}
