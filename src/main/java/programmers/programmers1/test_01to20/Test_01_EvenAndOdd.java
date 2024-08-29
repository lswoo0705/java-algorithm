package programmers.programmers1.test_01to20;

public class Test_01_EvenAndOdd {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}
