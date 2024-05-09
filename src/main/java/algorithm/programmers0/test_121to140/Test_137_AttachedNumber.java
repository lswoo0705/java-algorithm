package algorithm.programmers0.test_121to140;

public class Test_137_AttachedNumber {
    public int solution(int[] num_list) {
        StringBuilder oddSum = new StringBuilder();
        StringBuilder evenSum = new StringBuilder();

        for (int j : num_list) {
            if (j % 2 == 0) {
                evenSum.append(j);
            } else {
                oddSum.append(j);
            }
        }

        return Integer.parseInt(String.valueOf(oddSum)) + Integer.parseInt(String.valueOf(evenSum));
    }
}
