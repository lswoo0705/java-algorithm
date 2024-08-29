package programmers.programmers0.test_21to30;

public class Test_30_UppercaseAndLowercase {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) {
                answer += (char) (my_string.charAt(i) - 32);
            } else if (my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
                answer += (char) (my_string.charAt(i) + 32);
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
