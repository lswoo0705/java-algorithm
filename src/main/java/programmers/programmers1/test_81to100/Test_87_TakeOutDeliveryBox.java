package programmers.programmers1.test_81to100;

public class Test_87_TakeOutDeliveryBox {
    public int solution(int n, int w, int num) {
        // 창고 높이
        int h = (int) Math.ceil((double) n / w);

        // 창고 모양
        int[][] warehouse = new int[h][w];
        int boxNumber = 1;

        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) { // 왼쪽에서 오른쪽으로
                for (int j = 0; j < w && boxNumber <= n; j++) {
                    warehouse[i][j] = boxNumber++;
                }
            } else { // 오른쪽에서 왼쪽으로
                for (int j = w - 1; j >= 0 && boxNumber <= n; j--) {
                    warehouse[i][j] = boxNumber++;
                }
            }
        }

        // 꺼내려는 상자의 위치 찾기
        int row = 0, col = 0;
        outerLoop:
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (warehouse[i][j] == num) {
                    row = i;
                    col = j;
                    break outerLoop;
                }
            }
        }

        // 상자 꺼내기 (위에 있는 모든 상자 포함)
        int count = 0;
        for (int i = row; i < h; i++) {
            if (warehouse[i][col] != 0) {
                count++;
            }
        }

        return count;
    }
}
