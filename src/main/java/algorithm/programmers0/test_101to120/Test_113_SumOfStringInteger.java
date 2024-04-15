package algorithm.programmers0.test_101to120;

public class Test_113_SumOfStringInteger {
    public int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            answer += Character.getNumericValue(num_str.charAt(i));
        }
        return answer;
    }
}
