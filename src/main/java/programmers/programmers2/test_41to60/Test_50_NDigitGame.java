package programmers.programmers2.test_41to60;

public class Test_50_NDigitGame {
    public String solution(int n, int t, int m, int p) {
        // n : n진법
        // t : count가 t가 될 때 종료
        // m : 게임 참여 인원
        // p : 순서
        // 10~15는 각각 A~F
        StringBuilder answer = new StringBuilder();
        StringBuilder digitNum = new StringBuilder(); // 변환 후 숫자
        int number = 0; // 변환할 숫자

        // 필요한 숫자만큼 문자열 생성
        while (digitNum.length() < t * m) {
            digitNum.append(Integer.toString(number++, n).toUpperCase());
        }

        // 튜브가 말할 숫자
        for (int i = 0; i < t; i++) {
            answer.append(digitNum.charAt((p - 1) + i * m));
        }

        return answer.toString();
    }
}
