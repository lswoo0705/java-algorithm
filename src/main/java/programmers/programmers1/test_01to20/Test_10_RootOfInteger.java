package programmers.programmers1.test_01to20;

public class Test_10_RootOfInteger {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        if (x == (int) x) {
            answer = (long) ((x + 1) * (x + 1));
        } else {
            answer = -1;
        }
        return answer;
    }
}
