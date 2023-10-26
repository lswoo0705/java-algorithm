package algorithm.programmers0.test_31to40;

// 테스트 결과 실패!
public class Test_37_MaxNum {
    public int solution(int[] numbers) {
        int maxNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (maxNum < numbers[i] * numbers[j]) {
                    maxNum = numbers[i] * numbers[j];
                }
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Test_37_MaxNum sol = new Test_37_MaxNum();
//        int[] numbers = {1,2,-3,4,-5};
//        int[] numbers = {0, -31, 24, 10, 1, 9};
//        int[] numbers = {10, 20, 30, 5, 5, 20, 5};
        int[] numbers = {-5, 5};
        System.out.println(sol.solution(numbers));
    }
}
