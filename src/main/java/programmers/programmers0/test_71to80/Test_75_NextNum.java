package programmers.programmers0.test_71to80;

public class Test_75_NextNum {
    public int solution(int[] common) {
        int answer = 0;
        int arithmetic = 0; // 등차
        int geometric = 1; // 등비

        if (common[1] - common[0] == common[2] - common[1]) { // 등차수열
            arithmetic = common[1] - common[0];
            answer = common[common.length - 1] + arithmetic;
        } else { // 등비수열
            geometric = common[1] / common[0];
            answer = common[common.length - 1] * geometric;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_75_NextNum sol = new Test_75_NextNum();
//        int[] common = {1, 2, 3, 4}; // 5
        int[] common = {2, 4, 8}; // 16
        System.out.println(sol.solution(common));
    }
}
