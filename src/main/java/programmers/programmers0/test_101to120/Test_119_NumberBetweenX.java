package programmers.programmers0.test_101to120;

public class Test_119_NumberBetweenX {
    public int[] solution(String myString) {
        int xCount = (int) myString.chars()
                .filter(c -> c == 'x')
                .count();
        int[] answer = new int[xCount + 1];
        int answerIndex = 0;
        int lengthCount = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                lengthCount++;
            } else {
                answer[answerIndex] = lengthCount;
                lengthCount = 0;
                answerIndex++;
            }
        }
        answer[answerIndex] = lengthCount;

        return answer;
    }
}
