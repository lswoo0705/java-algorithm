package algorithm.programmers2.test_01to20;

public class Test_16_LongJump {
    public long solution(int n) {
//        long answer = 0;
//
//        for (int i = 0; i <= n / 2; i++) {
//            int numOfTwo = i;
//            int numOfOne = n - 2 * i;
//            answer += combination(numOfOne + numOfTwo, numOfTwo);
//        }
//
//        return answer % 1234567;
//    }
//
//    private long combination(int n, int k) {
//        long sum = 1;
//
//        for (int i = 1; i <= k; i++) {
//            sum = sum * (n - i + 1) / i;
//        }
//
//        return sum;


        // 피보나치 수열(재귀 호출)
        long answer = 0;

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        int beforeTwo = 1;
        int beforeOne = 2;

        for (int i = 3; i <= n; i++) {
            answer = beforeTwo + beforeOne;
            beforeTwo = beforeOne;
            beforeOne = (int) answer;
        }

        return answer % 1234567;
    }
}
