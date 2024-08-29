package programmers.programmers0.test_161to180;

// 수열과 구간 쿼리 3
public class Test_174_SequenceAndSectionQueries3 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int num;
            num = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = num;
        }

        return arr;
    }
}
