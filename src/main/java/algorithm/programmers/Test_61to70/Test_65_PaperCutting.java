package algorithm.programmers.Test_61to70;

public class Test_65_PaperCutting {
    public int solution(int M, int N) {
        int answer = 0;
        answer = M * N - 1;
        return answer;
    }

    public static void main(String[] args) {
        Test_65_PaperCutting sol = new Test_65_PaperCutting();
        int M = 2; int N = 2; // 2
//        int M = 2; int N = 5; // 9
//        int M = 3; int N = 4; // 11
        System.out.println(sol.solution(M, N));
    }
}
