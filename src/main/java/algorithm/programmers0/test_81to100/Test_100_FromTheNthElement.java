package algorithm.programmers0.test_81to100;

public class Test_100_FromTheNthElement {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        for (int i = n - 1; i < num_list.length; i++) {
            answer[i - (n - 1)] = num_list[i];
        }
        return answer;

//        int[] answer = new int[num_list.length - n + 1];
//        if (num_list.length - (n - 1) >= 0)
//            System.arraycopy(num_list, n - 1, answer, 0, num_list.length - (n - 1));
//        return answer;
    }
}
