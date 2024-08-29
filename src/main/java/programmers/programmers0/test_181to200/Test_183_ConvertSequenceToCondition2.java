package programmers.programmers0.test_181to200;

// 조건에 맞게 수열 변환하기 2
public class Test_183_ConvertSequenceToCondition2 {
    public int solution(int[] arr) {
        int answer = 0;
        boolean changed;

        do {
            changed = false;
            for (int i = 0; i < arr.length; i++) {
                int beforeNum = arr[i];
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
                if (arr[i] != beforeNum) {
                    changed = true;
                }
            }
            if (changed) {
                answer++;
            }
        } while (changed);

        return answer;
    }
}
