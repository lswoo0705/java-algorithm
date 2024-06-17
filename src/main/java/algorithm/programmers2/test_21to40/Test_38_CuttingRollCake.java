package algorithm.programmers2.test_21to40;

import java.util.HashSet;
import java.util.Set;

// 롤케이크 자르기
public class Test_38_CuttingRollCake {
    public int solution(int[] topping) {
        int answer = 0;
        int n = topping.length;

        int[] leftToppings = new int[n]; // 왼쪽까지의 토핑 종류 수
        Set<Integer> leftSet = new HashSet<>();

        int[] rightToppings = new int[n]; // 오른쪽까지의 토핑 종류 수
        Set<Integer> rightSet = new HashSet<>();

        // 왼쪽부터 토핑의 종류 수
        for (int i = 0; i < n; i++) {
            leftSet.add(topping[i]);
            leftToppings[i] = leftSet.size();
        }

        // 오른쪽부터 토핑 종류 수
        for (int i = n - 1; i >= 0; i--) {
            rightSet.add(topping[i]);
            rightToppings[i] = rightSet.size();
        }

        // 공평하게 나누는 방법의 수
        for (int i = 0; i < n - 1; i++) {
            if (leftToppings[i] == rightToppings[i + 1]) {
                answer++;
            }
        }

        return answer;
    }
}
