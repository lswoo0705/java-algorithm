package algorithm.programmers.Test_31to40;

import java.util.Arrays;

// 테스트 성공!
public class Test_37_MaxNum2 {
    public int solution(int[] numbers) {
        int leng = numbers.length;
        Arrays.sort(numbers);
        int lowNum = numbers[0] * numbers[1];
        int hightNum = numbers[leng - 1] * numbers[leng - 2];
        return Math.max(lowNum, hightNum);
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
