package programmers.programmers0.test_141to160;

// 가까운 1 찾기
public class Test_157_FindNearest1 {
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }

        return answer;
    }
}
