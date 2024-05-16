package algorithm.programmers0.test_141to160;

public class Test_148_MakingArrThird {
    public int[] solution(int[] arr, int[][] intervals) {
//        int[] answer = new int[intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2];
//
//        int arrIndex = 0;
//        int oneIndex = intervals[0][0];
//        int twoIndex = intervals[1][0];
//
//        while (oneIndex <= intervals[0][1]) {
//            answer[arrIndex] = arr[oneIndex];
//            arrIndex++;
//            oneIndex++;
//        }
//
//        while (twoIndex <= intervals[1][1]) {
//            answer[arrIndex] = arr[twoIndex];
//            arrIndex++;
//            twoIndex++;
//        }
//
//        return answer;

        int[] answer = new int[(intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1)];

        System.arraycopy(arr, intervals[0][0], answer, 0, intervals[0][1] - intervals[0][0] + 1);
        System.arraycopy(arr, intervals[1][0], answer, intervals[0][1] - intervals[0][0] + 1, intervals[1][1] - intervals[1][0] + 1);

        return answer;
    }
}
