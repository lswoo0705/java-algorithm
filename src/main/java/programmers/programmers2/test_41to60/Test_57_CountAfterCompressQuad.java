package programmers.programmers2.test_41to60;

public class Test_57_CountAfterCompressQuad {
    private int numOfZero = 0; // 0의 개수
    private int numOfOne = 0;  // 1의 개수

    public int[] solution(int[][] arr) {
        int n = arr.length;
        dividing(arr, 0, 0, n); // 전체 배열을 처음부터 시작
        return new int[]{numOfZero, numOfOne};
    }

    // x, y 좌표에서 시작하는 size 크기의 영역을 확인
    private void dividing(int[][] arr, int x, int y, int size) {
        if (isSame(arr, x, y, size)) {
            // 모든 값이 동일하면 해당 값 개수 증가
            if (arr[x][y] == 0) numOfZero++;
            else numOfOne++;
            return;
        }

        // 4등분하여 재귀적으로 처리
        int newSize = size / 2;
        dividing(arr, x, y, newSize); // 왼쪽 위
        dividing(arr, x, y + newSize, newSize); // 오른쪽 위
        dividing(arr, x + newSize, y, newSize); // 왼쪽 아래
        dividing(arr, x + newSize, y + newSize, newSize); // 오른쪽 아래
    }

    // 현재 영역이 모두 같은 값인지 확인
    private boolean isSame(int[][] arr, int x, int y, int size) {
        int first = arr[x][y]; // 첫 번째 값을 기준으로 비교
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != first) {
                    return false;
                }
            }
        }
        return true;
    }
}
