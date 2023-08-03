package algorithm.programmers.Test_61to70;

import java.util.ArrayList;
import java.util.List;

public class Test_69_FiniteDecimal {
    public int solution(int a, int b) {
        int answer = 0;
        int maxNum = 1; // 최대공약수

        for (int i = 1; i <= a && i <= b; i++) { // 분자와 분모 중 무엇이 큰지 모르므로
            if (a % i == 0 && b % i == 0) {      // a와 b가 나누어 떨어지는 수
                maxNum = i;                      // 가장 마지막에 나오는 수가 최대공약수
            }
        }
        // 유한소수인지에 대한 여부만 판단하므로 분자는 생략
        int irreducibleB = b / maxNum; // 분모를 최대공약수로 나누면 기약분수의 분모로 된다

        // 소인수분해 하기 위해 비어있는 어레이리스트 생성
        List<Integer> factorizationB = new ArrayList<>();

        for (int i = 2; i <= irreducibleB ; i++) {
            while (irreducibleB % i == 0) {  // 2부터 나누어떨어지는동안 계속 반복
                factorizationB.add(i);       // 나눈 수를 어레이리스트에 넣고
                irreducibleB /= i;           // 분모를 나눈다
            }
        }
        // 모든 분모는 1로 나누어지므로 따로 추가
        factorizationB.add(1);

        // 유한소수인지 판단
        for (int i = 0; i < factorizationB.size(); i++) {
            if (factorizationB.get(i) != 2 && factorizationB.get(i) != 5 && factorizationB.get(i) != 1) {
                answer = 2;
                break;
            } else {
                answer = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_69_FiniteDecimal sol = new Test_69_FiniteDecimal();
        int a = 7; int b = 20; // 1
        System.out.println(sol.solution(a, b));
    }
}
