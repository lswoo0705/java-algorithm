package programmers.programmers2.test_41to60;

public class Test_59_TriangularSnail {
    public int[] solution(int n) {
        // 1. 삼각형을 표현하기 위한 2차원 리스트 생성
        int[][] triangle = new int[n][n];
        int[] answer = new int[n * (n + 1) / 2]; // 1부터 n까지의 합이 배열 크기

        // 2. 달팽이 채우기 시작
        int num = 1;  // 채울 숫자
        int row = -1, col = 0; // 시작 위치 (처음 아래 방향 이동을 위해 row = -1)

        for (int i = 0; i < n; i++) { // 3번씩 방향을 바꾸면서 진행
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    row++; // 아래로 이동
                } else if (i % 3 == 1) {
                    col++; // 오른쪽 이동
                } else {
                    row--; // 위 대각선 이동
                    col--;
                }

                triangle[row][col] = num++;
            }
        }

        // 3. 2차원 배열을 1차원 배열로 변환
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[idx++] = triangle[i][j];
            }
        }

        return answer;
    }
}
