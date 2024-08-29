package programmers.programmers0.test_141to160;

public class Test_156_StringArrToString {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();

        for (String s : arr) {
            answer.append(s);
        }

        return answer.toString();
    }
}
