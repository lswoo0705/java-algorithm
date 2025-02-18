package programmers.programmers2.test_41to60;

public class Test_60_SumOfSuccessivePartialSequences {
    public int[] solution(int[] sequence, int k) {
        int left = 0, right = 0, sum = sequence[0];  // 초기 부분합 설정
        int minLength = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (right < sequence.length) {
            if (sum < k) {
                // 합이 k보다 작으면 right
                right++;
                if (right < sequence.length) sum += sequence[right];
            } else if (sum > k) {
                // 합이 k보다 크면 left
                sum -= sequence[left];
                left++;
            } else {
                // 합이 k인 경우
                int length = right - left + 1;
                if (length < minLength) {
                    // 최소 길이 갱신
                    minLength = length;
                    answer[0] = left;
                    answer[1] = right;
                }
                // left를 증가시켜 다음 부분합을 탐색
                sum -= sequence[left];
                left++;
            }
        }
        return answer;
    }
}
