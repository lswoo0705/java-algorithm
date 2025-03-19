package programmers.programmers2.test_61to80;

import java.util.ArrayList;
import java.util.List;

public class Test_71_HowToLineUp {
    public int[] solution(int n, long k) {
        List<Integer> numbers = new ArrayList<>();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            fact *= i;  // n! 계산
        }

        int[] answer = new int[n];
        k--; // 0-based index로 변환

        for (int i = 0; i < n; i++) {
            fact /= (n - i);  // (n-i)! 값
            int index = (int) (k / fact); // 현재 선택할 숫자의 인덱스
            answer[i] = numbers.get(index);
            numbers.remove(index); // 사용한 숫자 제거
            k %= fact; // 다음 k값 업데이트
        }

        return answer;
    }
}
