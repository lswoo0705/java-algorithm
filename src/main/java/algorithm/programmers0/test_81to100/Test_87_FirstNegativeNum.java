package algorithm.programmers0.test_81to100;

public class Test_87_FirstNegativeNum {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        
        return -1;
    }
}
