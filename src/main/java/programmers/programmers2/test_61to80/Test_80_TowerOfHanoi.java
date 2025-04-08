package programmers.programmers2.test_61to80;

import java.util.ArrayList;
import java.util.List;

public class Test_80_TowerOfHanoi {
    List<int[]> moves = new ArrayList<>();

    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2);

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

        hanoi(n - 1, from, via, to);
        moves.add(new int[]{from, to});
        hanoi(n - 1, via, to, from);
    }
}
