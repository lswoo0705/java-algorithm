package algorithm.programmers0.test_71to80;

import java.util.Arrays;

public class Test_76_AdditionOfFraction {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int denom3 = denom1 * denom2;
        int maxNum = 1; // 최대공약수

        // 최대공약수 구하기
        for (int i = 1; i <= numer3 && i <= denom3; i++) {
            if (numer3 % i == 0 && denom3 % i == 0) {
                maxNum = i;
            }
        }

        answer = new int[]{numer3 / maxNum, denom3 / maxNum};

        return answer;
    }

    public static void main(String[] args) {
        Test_76_AdditionOfFraction sol = new Test_76_AdditionOfFraction();
        int numer1 = 1; int denom1 = 2; int numer2 = 3; int denom2 = 4; // 5, 4
//        int numer1 = 9; int denom1 = 2; int numer2 = 1; int denom2 = 3; // 29, 6
        System.out.println(Arrays.toString(sol.solution(numer1, denom1, numer2, denom2)));
    }
}
