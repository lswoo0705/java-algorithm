package programmers.programmers1.test_01to20;

public class Test_09_AdditionOfDigits {
    public int solution(int n) {
        int answer = 0;
        String[] strArr = String.valueOf(n).split("");
        for (int i = 0; i < strArr.length; i++) {
            answer += Integer.parseInt(strArr[i]);
        }

        return answer;
    }
}
