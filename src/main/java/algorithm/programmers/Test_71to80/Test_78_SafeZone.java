package algorithm.programmers.Test_71to80;

public class Test_78_SafeZone {
    public int solution(int[][] board) {
        int answer = 0;
        // 폭탄 주변의 좌표
        int[] dx = {-1, 0, 1, 0, -1, 1, -1, 1};
        int[] dy = {0, 1, 0, -1, -1, -1, 1, 1};
        // 체크 유무 확인용
        boolean[][] boomLocation = new boolean[board.length][board.length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                for (int k = 0; k < 8; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    // 폭탄(1)이 있다면 true
                    if (board[i][j] == 1) {
                        boomLocation[i][j] = true;
                    }

                    // 폭탄 주변의 좌표가 범위를 벗어나지 않다면 true로
                    if (nx >= 0 && nx < board.length && ny >= 0 && ny < board.length && board[nx][ny] == 1) {
                        boomLocation[i][j] = true;
                    }
                }
            }
        }

        // false의 개수(안전지대)를 반환
        for (int i = 0; i < boomLocation.length; i++) {
            for (int j = 0; j < boomLocation.length; j++) {
                if (!boomLocation[i][j]) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_78_SafeZone sol = new Test_78_SafeZone();
//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        System.out.println(sol.solution(board));
    }
}
