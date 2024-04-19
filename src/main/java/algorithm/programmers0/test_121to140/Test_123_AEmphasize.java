package algorithm.programmers0.test_121to140;

public class Test_123_AEmphasize {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'a' || myString.charAt(i) == 'A') {
                answer.append(Character.toUpperCase(myString.charAt(i)));
            } else {
                answer.append(Character.toLowerCase(myString.charAt(i)));
            }
        }

        return answer.toString();
    }
}
