package programmers.programmers1.test_61to80;

public class Test_63_NumberPartner {
    public String solution(String X, String Y) {
        /*
        StringBuilder word = new StringBuilder();
        StringBuilder YBuilder;
        YBuilder = new StringBuilder(Y);

        for (int i = 0; i < X.length(); i++) {
            for (int j = 0; j < YBuilder.length(); j++) {
                if (X.charAt(i) == YBuilder.charAt(j)) {
                    word.append(Y.charAt(j));
                    YBuilder.setCharAt(j, 'S');
                }
            }
        }
        */

        // 중복 코드 정리

        /*
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < X.length(); i++) {
            for (int j = 0; j < Y.length(); j++) {
                if (X.charAt(i) == Y.charAt(j)) {
                    word.append(Y.charAt(j));
                    Y = Y.substring(0, j) + 'S' + Y.substring(j + 1);
                    break;
                }
            }
        }

        char[] sortedChars = word.toString().toCharArray();
        Arrays.sort(sortedChars);
        word = new StringBuilder(new String(sortedChars)).reverse();

        String answer = word.toString();

        if (answer.matches("^0+$")) {
            return "0";
        } else if (answer.isEmpty()) {
            return "-1";
        }

        return answer;
        */

        // 속도 개선

        int[] countX = new int[10]; // X에서 각 숫자의 개수를 저장할 배열
        int[] countY = new int[10]; // Y에서 각 숫자의 개수를 저장할 배열
        StringBuilder word = new StringBuilder();

        // X와 Y에서 각 숫자의 개수를 세기
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }

        // 공통으로 나타나는 숫자들 중 가장 큰 숫자부터 처리
        for (int i = 9; i >= 0; i--) {
            int minCount = Math.min(countX[i], countY[i]); // X와 Y에서 해당 숫자의 최소 개수
            for (int j = 0; j < minCount; j++) {
                word.append(i);
            }
        }

        // 결과 문자열이 비어있으면 -1, 0이 중복으로 여러개 있다면 0 반환
        if (word.length() == 0) {
            return "-1";
        } else if (word.toString().matches("^0+$")) {
            return "0";
        }

        return word.toString();
    }

    public static void main(String[] args) {
        Test_63_NumberPartner sol = new Test_63_NumberPartner();
//        String X = "100"; String Y = "2345"; // "-1"
//        String X = "100"; String Y = "203045"; // "0"
//        String X = "100"; String Y = "123450"; // "10"
//        String X = "12321"; String Y = "42531"; // "321"
        String X = "5525"; String Y = "1255"; // "552"
        System.out.println(sol.solution(X, Y));
    }
}
