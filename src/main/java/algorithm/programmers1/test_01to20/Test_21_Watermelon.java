package algorithm.programmers1.test_01to20;

public class Test_21_Watermelon {
    public String solution(int n) {
        /*
        StringBuilder answer = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                answer.append("수박");
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                answer.append("수박");
            }
            answer.append("수");
        }
        return answer.toString();
        */

        StringBuilder answer = new StringBuilder();
        answer.append("수박".repeat(Math.max(0, n / 2)));
        if (n % 2 != 0) {
            answer.append("수");
        }
        return answer.toString();
    }
}
