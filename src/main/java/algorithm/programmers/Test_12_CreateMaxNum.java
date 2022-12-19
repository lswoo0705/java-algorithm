package algorithm.programmers;

public class Test_12_CreateMaxNum {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int first = 0; first < numbers.length; first++) {
            for (int second = 0; second < numbers.length; second++) {
                if (first != second && numbers[first] * numbers[second] > answer) {
                    answer = numbers[first] * numbers[second];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_12_CreateMaxNum sol = new Test_12_CreateMaxNum();
        int[] input = {0, 9, 6, 5, 1, 9};

        System.out.println(sol.solution(input));
    }
}
