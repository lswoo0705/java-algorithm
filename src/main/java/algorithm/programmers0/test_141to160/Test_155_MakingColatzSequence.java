package algorithm.programmers0.test_141to160;

import java.util.ArrayList;
import java.util.List;

public class Test_155_MakingColatzSequence {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();

        answerList.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                answerList.add(n);
            } else {
                n = n * 3 + 1;
                answerList.add(n);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
