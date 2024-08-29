package programmers.programmers1.test_61to80;

public class Test_68_AdjacentRoom {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String mainColor = board[h][w];
        // 상
        if (h > 0 && board[h - 1][w].equals(mainColor)) {
            answer++;
        }
        // 하
        if (h < board.length - 1 && board[h + 1][w].equals(mainColor)) {
            answer++;
        }
        // 좌
        if (w > 0 && board[h][w - 1].equals(mainColor)) {
            answer++;
        }
        // 우
        if (w < board.length - 1 && board[h][w + 1].equals(mainColor)) {
            answer++;
        }
        return answer;
    }
}
