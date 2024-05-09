package algorithm.programmers0.test_121to140;

// 홀짝에 따라 다른 값 반환하기

public class Test_138_ReturnValueDependingOnOddity {
    public int solution(int n) {
        int answer = 0;
        boolean isOddNum = n % 2 != 0;

        if (isOddNum) {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        } else {
            for (int i = 2; i <= n; i += 2) {
                answer += i * i;
            }
        }

        return answer;
    }
}
