package programmers.programmers0.test_161to180;

public class Test_176_AreaOf2 {
    public int[] solution(int[] arr) {
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                startIndex = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                endIndex = i;
                break;
            }
        }

        if (startIndex == -1 || endIndex == -1) {
            return new int[]{-1};
        }

        int[] answer = new int[endIndex - startIndex + 1];

        System.arraycopy(arr, startIndex, answer, 0, answer.length);

        return answer;
    }
}
