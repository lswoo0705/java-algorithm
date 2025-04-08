package programmers.programmers2.test_61to80;

import java.util.ArrayList;
import java.util.List;

public class Test_80_TowerOfHanoi {
    List<int[]> moves = new ArrayList<>();

    public int[][] solution(int n) {
        // n개의 원판을 from 기둥에서 to 기둥으로 옮기기 위해
        // n-1개의 원판을 from → via로 옮긴다.
        // 가장 큰 원판 1개를 from → to로 옮긴다.
        // n-1개의 원판을 via → to로 옮긴다.

        hanoi(n, 1, 3, 2);

        // 리스트를 배열로
        int[][] answer = new int[moves.size()][2];
        for (int i = 0; i < moves.size(); i++) {
            answer[i] = moves.get(i);
        }

        return answer;
    }

    private void hanoi(int n, int from, int to, int via) {
        if (n == 1) {
            moves.add(new int[]{from, to});
            return;
        }

        hanoi(n - 1, from, via, to); // 1단계
        moves.add(new int[]{from, to}); // 2단계
        hanoi(n - 1, via, to, from); // 3단계
    }
}
