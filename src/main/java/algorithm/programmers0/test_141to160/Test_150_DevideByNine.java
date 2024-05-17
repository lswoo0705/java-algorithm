package algorithm.programmers0.test_141to160;

public class Test_150_DevideByNine {
    public int solution(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }

        return sum % 9;
    }
}
