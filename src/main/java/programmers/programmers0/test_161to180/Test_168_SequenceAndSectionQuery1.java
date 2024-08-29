package programmers.programmers0.test_161to180;

public class Test_168_SequenceAndSectionQuery1 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            for (int i = start; i <= end; i++) {
                arr[i]++;
            }
        }

        return arr;
    }
}
