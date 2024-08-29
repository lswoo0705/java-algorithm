package programmers.programmers0.test_141to160;

public class Test_159_AddEquivalenceSequence {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + d * i;
            }
        }

        return answer;
    }
}
