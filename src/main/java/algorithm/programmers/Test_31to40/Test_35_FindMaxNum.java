package algorithm.programmers.Test_31to40;

public class Test_35_FindMaxNum {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > answer[0]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}
