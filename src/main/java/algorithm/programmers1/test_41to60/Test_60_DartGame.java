package algorithm.programmers1.test_41to60;

public class Test_60_DartGame {
    public int solution(String dartResult) {
        int answer = 0;

        int[] point = new int[4];

        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = index; j < dartResult.length(); j++) {
                if (dartResult.charAt(j) == '1' && dartResult.charAt(j + 1) == '0') {
                    i++;
                    point[i] = 10;
                    index = j + 2;
                    j++;
                } else if (Character.isDigit(dartResult.charAt(j))) {
                    i++;
                    point[i] = Character.getNumericValue(dartResult.charAt(j));
                    index = j + 1;
                }

                if (dartResult.charAt(j) == 'S') {
                    point[i] = (int) Math.pow(point[i], 1);
                } else if (dartResult.charAt(j) == 'D') {
                    point[i] = (int) Math.pow(point[i], 2);
                } else if (dartResult.charAt(j) == 'T') {
                    point[i] = (int) Math.pow(point[i], 3);
                } else if (dartResult.charAt(j) == '*') {
                    if (i > 0) {
                        point[i - 1] *= 2;
                    }
                    point[i] *= 2;
                } else if (dartResult.charAt(j) == '#') {
                    point[i] *= -1;
                }
            }
        }

        for (int i = 0; i < point.length; i++) {
            answer += point[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_60_DartGame sol = new Test_60_DartGame();
        String dartResult = "1S2D*3T"; // 출력값 : 37
//        String dartResult = "1D2S#10S"; // 출력값 : 9
        System.out.println(sol.solution(dartResult));

    }
}
