package programmers.programmers0.test_201to220;

import java.util.Arrays;

public class Test_208_UnusualAlignment {
    public int[] solution(int[] numlist, int n) {
        // Integer 배열로 변환 (Comparator 사용을 위해)
        Integer[] nums = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        // 커스텀 정렬
        Arrays.sort(nums, (a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);

            // n과의 차이가 같다면 더 큰 수가 앞에 오도록
            if (distA == distB) {
                return b - a;
            }
            // n과의 거리가 가까운 순서대로
            return distA - distB;
        });

        // Integer 배열을 int 배열로 변환
        return Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
    }
}
