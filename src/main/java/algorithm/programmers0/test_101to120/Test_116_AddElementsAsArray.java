package algorithm.programmers0.test_101to120;

public class Test_116_AddElementsAsArray {
    public int[] solution(int[] arr) {
        int answerLength = 0;
        for (int j : arr) {
            answerLength += j;
        }
        int[] answer = new int[answerLength];

        int index = 0;
        for (int k : arr) {
            for (int j = 0; j < k; j++) {
                answer[index++] = k;
            }
        }

        return answer;
    }
}
