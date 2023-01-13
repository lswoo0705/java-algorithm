package algorithm.programmers.Test_31to40;

public class Test_36_RotatingArray {
    public int[] solution(int[] numbers, String direction) {

        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length - 1; i++) {
            if (direction.equals("right")) {
                answer[i + 1] = numbers[i];
                answer[0] = numbers[numbers.length - 1];
            } else if (direction.equals("left")) {
                answer[i] = numbers[i + 1];
                answer[numbers.length - 1] = numbers[0];
            }
        }

        return answer;
    }
}
