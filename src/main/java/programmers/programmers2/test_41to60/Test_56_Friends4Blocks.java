package programmers.programmers2.test_41to60;

public class Test_56_Friends4Blocks {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] map = new char[m][n];

        // 1. 문자열 배열을 2차원 문자 배열로 변환
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }

        while (true) {
            boolean[][] toRemove = new boolean[m][n];
            boolean found = false;

            // 2. 2x2 블록 찾기
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char block = map[i][j];
                    if (block != '.' &&
                            block == map[i][j + 1] &&
                            block == map[i + 1][j] &&
                            block == map[i + 1][j + 1]) {

                        toRemove[i][j] = toRemove[i][j + 1] =
                                toRemove[i + 1][j] = toRemove[i + 1][j + 1] = true;
                        found = true;
                    }
                }
            }

            // 3. 더 이상 제거할 블록이 없으면 종료
            if (!found) break;

            // 4. 블록 제거 및 개수 세기
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (toRemove[i][j]) {
                        map[i][j] = '.';
                        answer++;
                    }
                }
            }

            // 5. 블록 아래로 떨어뜨리기
            for (int j = 0; j < n; j++) { // 열 단위로 떨어뜨림
                for (int i = m - 1; i > 0; i--) {
                    if (map[i][j] == '.') {
                        int k = i - 1;
                        while (k >= 0 && map[k][j] == '.') {
                            k--; // 위쪽에서 블록 찾기
                        }
                        if (k >= 0) {
                            map[i][j] = map[k][j]; // 블록 이동
                            map[k][j] = '.'; // 기존 위치 비우기
                        }
                    }
                }
            }
        }

        return answer;
    }
}
