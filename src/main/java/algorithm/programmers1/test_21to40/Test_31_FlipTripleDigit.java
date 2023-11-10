package algorithm.programmers1.test_21to40;

public class Test_31_FlipTripleDigit {
    public int solution(int n) {
        int answer = 0;
        // n을 3진법으로 표현 (int는 10진법으로 인식하기 때문에 string으로)
        String stringN = Integer.toString(n, 3);
        // 숫자(문자열) 뒤집기
        StringBuilder sb = new StringBuilder(stringN);
        String reverse = sb.reverse().toString();
        // 3진수를 10진수로
        answer = Integer.parseInt(reverse, 3);

        return answer;
    }
}
