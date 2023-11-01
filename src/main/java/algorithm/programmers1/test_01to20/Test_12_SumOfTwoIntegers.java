package algorithm.programmers1.test_01to20;

public class Test_12_SumOfTwoIntegers {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = 0; i < b - a + 1; i++) {
                answer += a + i;
            }
        } else if (a > b) {
            for (int i = 0; i < a - b + 1; i++) {
                answer += b + i;
            }
        } else {
            return a;
        }
        return answer;
    }
}
