package programmers.programmers0.test_121to140;

public class Test_129_ChangeOrder {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        //              복사될배열, 복사시작인덱스, 복사된배열, 복사받을시작인덱스, 복사할 길이
        System.arraycopy(num_list, n, answer, 0, num_list.length - n);
        System.arraycopy(num_list, 0, answer, num_list.length - n, n);

        return answer;
    }
}
