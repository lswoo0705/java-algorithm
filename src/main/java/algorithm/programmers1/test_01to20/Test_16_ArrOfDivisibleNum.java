package algorithm.programmers1.test_01to20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test_16_ArrOfDivisibleNum {
    public int[] solution(int[] arr, int divisor) {
        // 비어있는 리스트 선언
        List<Integer> intList = new ArrayList<>();
        // 리스트에 divisor로 나누어 떨어지는 원소를 arr배열에 넣기
        for (int j : arr) {
            if (j % divisor == 0) {
                intList.add(j);
            }
        }
        // 오름차순으로 정렬
        intList.sort(Comparator.naturalOrder());
        // 반환할 answer 배열 선언
        int[] answer = new int[intList.size()];
        // 리스트의 원소를 answer에 넣기
        for (int i = 0; i < answer.length; i++) {
            answer[i] = intList.get(i);
        }
        // answer의 원소가 없다면 -1을 반환
        if (answer.length == 0) {
            return new int[]{-1};
        }
        return answer;
    }
}
