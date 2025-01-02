package programmers.programmers0.test_181to200;

public class Test_192_SequenceAndIntervalQuery2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min = 1000000;
            boolean found = false;

            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < min) {
                    min = arr[j];
                    found = true;
                }
            }

            answer[i] = found ? min : -1;
        }

        return answer;
    }
}