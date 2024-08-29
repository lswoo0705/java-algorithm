package programmers.programmers1.test_41to60;

import java.util.Arrays;

public class Test_51_Ponkemon {
    public int solution(int[] nums) {
        int answer = 0;
        int maxNum = nums.length / 2;
        // 배열의 중복 제거
        nums = Arrays.stream(nums).distinct().toArray();

        answer = Math.min(nums.length, maxNum);
        return answer;
    }
}
