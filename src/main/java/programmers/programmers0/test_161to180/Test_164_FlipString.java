package programmers.programmers0.test_161to180;

public class Test_164_FlipString {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();

        answer.append(my_string, 0, s);

        for (int i = e; i >= s; i--) {
            answer.append(my_string.charAt(i));
        }

        answer.append(my_string.substring(e + 1));

        return answer.toString();
    }
}
