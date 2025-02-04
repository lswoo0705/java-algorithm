package programmers.programmers0.test_221to240;

public class Test_221_PlacingIntegersInSpiral {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        // 오른쪽, 아래, 왼쪽, 위쪽 이동
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        // 시작 위치 및 방향 설정
        int x = 0;
        int y = 0;
        int dir = 0;

        for (int num = 1; num <= n * n; num++) {
            answer[x][y] = num; // 현재 위치에 숫자 채우기
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 범위를 벗어나거나 이미 숫자가 있는 경우 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                dir = (dir + 1) % 4; // 방향 바꾸기 (시계방향)
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            // 새로운 위치로 이동
            x = nx;
            y = ny;
        }

        return answer;
    }
}
