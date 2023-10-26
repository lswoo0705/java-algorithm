package algorithm.programmers0.Test_51to60;

public class Test_57_ThrowingABall {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for (int i = 1; i < k; i++) {
            answer += 2;
            if (answer > numbers.length) {
                answer -= numbers.length;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_57_ThrowingABall sol = new Test_57_ThrowingABall();
        int[] numbers = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(sol.solution(numbers, k));
    }
}
