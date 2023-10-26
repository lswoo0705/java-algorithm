package algorithm.programmers0.test_41to50;

public class Test_46_Factorial {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= 10; i++) {
            if (n >= factorial(i)) {
                answer = i;
            }
        }
        return answer;
    }

    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
