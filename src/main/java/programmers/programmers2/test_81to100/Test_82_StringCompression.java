package programmers.programmers2.test_81to100;

public class Test_82_StringCompression {
    public int solution(String s) {
        int answer = s.length();

        // 1.압축 단위를 1부터 반복하면서 압축
        for (int i = 1; i <= s.length() / 2; i++) {
            // 2.substring으로 자르기
            StringBuilder compressedString = new StringBuilder();
            String prev = s.substring(0, i);
            int count = 1;

            // 3.StringBuilder로 문자 연결
            for (int j = i; j <= s.length(); j += i) {
                String next = s.substring(j, Math.min(j + i, s.length()));

                if (prev.equals(next)) {
                    count++;
                } else {
                    if (count > 1) {
                        compressedString.append(count);
                    }
                    compressedString.append(prev);
                    prev = next;
                    count = 1;
                }
            }

            // 4.길이 비교해서 정답을 반환
            if (count > 1) {
                compressedString.append(count);
            }
            compressedString.append(prev);

            answer = Math.min(answer, compressedString.length());
        }

        return answer;
    }
}
