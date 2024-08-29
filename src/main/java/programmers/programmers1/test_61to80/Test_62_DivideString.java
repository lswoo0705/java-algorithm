package programmers.programmers1.test_61to80;

public class Test_62_DivideString {
    public int solution(String s) {
        int answer = 0;
        int index = 0;

        // 단어 전체 돌리기
        while (index < s.length()) {
            String xWord = String.valueOf(s.charAt(index));
            int xCount = 0;
            int notXCount = 0;

            // 같은 수가 나올때까지
            while (index < s.length()) {
                if (s.charAt(index) == xWord.charAt(0)) {
                    xCount++;
                } else {
                    notXCount++;
                }

                // x와 x가 아닌 문자의 개수가 같아지면 반복 중단
                if (xCount == notXCount) {
                    break;
                }

                index++;
            }

            answer++;

            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_62_DivideString sol = new Test_62_DivideString();
        String s = "banana"; // answer = 3
//        String s = "abracadabra"; // answer = 6
//        String s = "aaabbaccccabba"; // answer = 3
        System.out.println(sol.solution(s));
    }
}

