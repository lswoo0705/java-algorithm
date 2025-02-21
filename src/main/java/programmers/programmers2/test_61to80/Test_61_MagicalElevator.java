package programmers.programmers2.test_61to80;

public class Test_61_MagicalElevator {
    public int solution(int storey) {
        int answer = 0;

        while (storey > 0) {
            int digit = storey % 10;  // 현재 자리 숫자
            int nextDigit = (storey / 10) % 10;  // 다음 자리 숫자 확인

            if (digit < 5) {
                answer += digit;  // 내리기 (-)
            } else if (digit > 5) {
                answer += (10 - digit);  // 올리기 (+)
                storey += 10;  // 다음 자리에서 1 증가
            } else {  // digit == 5
                if (nextDigit >= 5) {  // 다음 자리 숫자가 5 이상이면 올림
                    storey += 10;
                }
                answer += 5;
            }

            storey /= 10;  // 한 자리 제거
        }

        return answer;
    }
}
