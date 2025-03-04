package programmers.programmers2.test_61to80;

public class Test_65_124NationalNumbers {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int[] numbers = {4, 1, 2}; // 124 나라에서 사용하는 숫자 배열

        while (n > 0) {
            int remainder = n % 3; // 3으로 나눈 나머지
            n /= 3;

            if (remainder == 0) {
                n--; // 나머지가 0이면 몫에서 1을 빼줌
            }

            answer.insert(0, numbers[remainder]); // 변환된 숫자를 앞쪽에 추가
        }

        return answer.toString();
    }
}
