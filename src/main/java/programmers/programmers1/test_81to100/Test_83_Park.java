package programmers.programmers1.test_81to100;

public class Test_83_Park {
    public int solution(int[] mats, String[][] park) {
        // 돗자리 크기를 내림차순 정렬
        java.util.Arrays.sort(mats);
        for (int i = mats.length - 1; i >= 0; i--) {
            int matSize = mats[i];
            if (canPlaceMat(matSize, park)) {
                return matSize; // 가장 큰 크기의 돗자리 반환
            }
        }
        return -1; // 어떤 돗자리도 놓을 수 없으면 -1 반환
    }

    // 특정 크기의 돗자리를 놓을 수 있는지 확인하는 메서드
    private boolean canPlaceMat(int matSize, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;

        // 공원의 각 위치에서 돗자리를 놓을 수 있는지 검사
        for (int i = 0; i <= rows - matSize; i++) {
            for (int j = 0; j <= cols - matSize; j++) {
                if (canPlaceAtPosition(matSize, park, i, j)) {
                    return true; // 적합한 위치가 있으면 true 반환
                }
            }
        }
        return false;
    }

    // 특정 위치에서 돗자리를 놓을 수 있는지 검사
    private boolean canPlaceAtPosition(int matSize, String[][] park, int startRow, int startCol) {
        for (int i = startRow; i < startRow + matSize; i++) {
            for (int j = startCol; j < startCol + matSize; j++) {
                if (!park[i][j].equals("-1")) { // 사람이 있으면 해당 위치에 돗자리 불가능
                    return false;
                }
            }
        }
        return true; // 모든 위치가 비어 있으면 true 반환
    }
}
