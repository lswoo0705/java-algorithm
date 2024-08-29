package programmers.programmers0.test_01to20;

public class Test_09_EvenOddNumbers {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }

    public static void main(String[] args) {
        Test_09_EvenOddNumbers sol = new Test_09_EvenOddNumbers();
        int[] input = {1,3,5,7};

        System.out.println(sol.solution(input));
    }
}
