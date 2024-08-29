package programmers.programmers2.test_01to20;

import java.util.Arrays;

public class Test_20_HIndex {
    public int solution(int[] citations) {
        // 과학자가 발표한 논문 n편 중
        // h번 이상 인용된 논문이 h편 이상이고
        // h번 미만
        int n = citations.length;
        Arrays.sort(citations);
        // 0, 1, 3, 5, 6

        for (int h = n; h > 0; h--) { // n = 5, h = 3
            for (int i = 0; i < n; i++) { // i = 2
                if (citations[i] >= h) {
                    int numOfH = n - i; // 5 - 2 = 3
                    if (numOfH == h) {
                        return numOfH;
                    }
                }
            }
        }
        return 0;
    }
}
