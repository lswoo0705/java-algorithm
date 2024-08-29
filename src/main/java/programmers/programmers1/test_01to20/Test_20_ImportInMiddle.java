package programmers.programmers1.test_01to20;

public class Test_20_ImportInMiddle {
    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 != 0) { // 문자열 길이가 홀수
            answer = s.substring(s.length() / 2, s.length() / 2 + 1);
        } else { // 문자열 길이가 짝수
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
        return answer;
    }
}
