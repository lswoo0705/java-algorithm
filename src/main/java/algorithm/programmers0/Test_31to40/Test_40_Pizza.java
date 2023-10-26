package algorithm.programmers0.Test_31to40;

public class Test_40_Pizza {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 6 * n; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_40_Pizza sol = new Test_40_Pizza();
        int n = 10;
        System.out.println(sol.solution(n));
    }
}
