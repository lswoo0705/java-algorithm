package programmers.programmers2.test_61to80;

import java.util.Arrays;
import java.util.Comparator;

public class Test_78_TableHashFunction {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        // 정렬
        Arrays.sort(data, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[col - 1] == b[col - 1]) {
                    return Integer.compare(b[0], a[0]);  // 기본키(첫 번째 컬럼) 기준 내림차순
                }
                return Integer.compare(a[col - 1], b[col - 1]);  // col 번째 기준 오름차순
            }
        });

        // S_i 계산, XOR 연산
        int answer = 0;
        for (int i = row_begin - 1; i < row_end; i++) {
            int sum = 0;
            for (int value : data[i]) {
                sum += value % (i + 1);
            }
            answer ^= sum;  // XOR 연산
        }

        return answer;
    }
}
