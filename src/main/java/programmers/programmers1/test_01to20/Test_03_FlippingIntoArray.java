package programmers.programmers1.test_01to20;

public class Test_03_FlippingIntoArray {
    public int[] solution(long n) {
        // 파라미터 타입을 char로
        String strN = String.valueOf(n);
        char[] s = strN.toCharArray();
        // 뒤집어질 배열 만들기
        int[] answer = new int[s.length];
        for (int i = strN.length() - 1; i >= 0; i--) {
            answer[strN.length() - 1 - i] = strN.charAt(i) - '0';
        }
        return answer;
    }
}
