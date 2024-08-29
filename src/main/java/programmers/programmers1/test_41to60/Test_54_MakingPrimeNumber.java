package programmers.programmers1.test_41to60;

public class Test_54_MakingPrimeNumber {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int checkNum = nums[i] + nums[j] + nums[k];
                    boolean checkPrime = false;
                    for (int l = 2; l <= Math.sqrt(checkNum); l++) {
                        if (checkNum % l == 0) {
                            checkPrime = false;
                            break;
                        }
                        checkPrime = true;
                    }
                    if (checkPrime) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
