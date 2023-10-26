package algorithm.programmers0.test_01to20;

public class Test_20_OrderPair {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
