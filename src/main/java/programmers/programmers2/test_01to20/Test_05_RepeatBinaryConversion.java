package programmers.programmers2.test_01to20;

public class Test_05_RepeatBinaryConversion {
    public int[] solution(String s) {
        // 이진변환
        // 0을 모두 제거
        // s의 길이를 2진법으로 표현한 문자열로
        // 이 과정을 s = 1이 될때까지 반복
        // 반복 횟수, 제거된 0의 개수를 배열로 리턴

        int binaryCount = 0;
        int zeroCount = 0;

        while (s.length() != 1) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCount++;
                }
            }
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            binaryCount++;
        }

        return new int[]{binaryCount, zeroCount};
    }
}
