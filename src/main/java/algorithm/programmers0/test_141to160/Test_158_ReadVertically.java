package algorithm.programmers0.test_141to160;

public class Test_158_ReadVertically {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
