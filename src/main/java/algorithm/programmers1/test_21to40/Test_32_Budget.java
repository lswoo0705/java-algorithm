package algorithm.programmers1.test_21to40;

import java.util.Arrays;

public class Test_32_Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int requiredAmount = 0;
        // 적은 금액부터 더해야 많은 부서의 물품을 구매할 수 있으므로 오름차순 정렬
        Arrays.sort(d);
        // 예산을 넘지 않을 때까지 더하기
        for (int j : d) {
            requiredAmount += j;
            if (requiredAmount <= budget) {
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}
