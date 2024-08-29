package programmers.programmers0.test_51to60;

public class Test_56_TheNumberOf7 {
    public int solution(int[] array) {
        int answer = 0;
        for (int num : array) {
            while (num > 0) {
                if (num % 10 == 7) {
                    answer++;
                }
                num /= 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_56_TheNumberOf7 sol = new Test_56_TheNumberOf7();
        int[] array = {7, 77, 17};
        System.out.println(sol.solution(array));
    }
}
