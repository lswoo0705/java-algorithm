package algorithm.programmers1.test_41to60;

public class Test_44_FoodFightCompetition {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            if (food[i] > 1) {
                String appendWord = String.valueOf(i);
                answer.append(appendWord.repeat(food[i] / 2));
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        String reverseWord = sb.reverse().toString();

        answer.append("0").append(reverseWord);

        return answer.toString();
    }
}
