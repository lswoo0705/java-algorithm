package programmers.programmers0.test_51to60;

public class Test_60_DivideTheBeads {
    public int solution(int balls, int share) {
        long answer = 1;
        int num = 1;
        for(int i = share+1; i <= balls; i++){
            answer *= i;
            answer /= num;
            num++;
        }

        return (int) answer;
    }

    public static void main(String[] args) {
        Test_60_DivideTheBeads sol = new Test_60_DivideTheBeads();
        int balls = 5;
        int share = 3;
        System.out.println(sol.solution(balls, share));
    }
}
