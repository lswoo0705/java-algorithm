package algorithm.programmers2.test_01to20;

public class Test_06_representationOfNumbers {
    public int solution(int n) {
        int answer = 0;
        int startNum = 1;

        while (startNum <= n) {
            int sum = 0;
            for (int i = startNum; i <= n; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
            startNum++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_06_representationOfNumbers sol = new Test_06_representationOfNumbers();
//        int n = 15;
        int n = 5;
        System.out.println(sol.solution(n));
    }
}
