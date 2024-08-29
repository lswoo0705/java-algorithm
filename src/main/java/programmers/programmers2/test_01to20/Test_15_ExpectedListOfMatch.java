package programmers.programmers2.test_01to20;

public class Test_15_ExpectedListOfMatch {
    public int solution(int n, int a, int b) {
        int answer = 1;

        while (!(a % 2 != 0 && a + 1 == b) && !(b % 2 != 0 && b + 1 == a)) { // 매치에서 만나지 않은 동안
            n /= 2;
            a = nextMatchNum(a);
            b = nextMatchNum(b);
            answer++;

            if (n == 2) {
                return answer;
            }
        }

        return answer;
    }

    private int nextMatchNum(int num) {
        if (num % 2 == 0) {
            num /= 2;
        } else {
            num = num / 2 + 1;
        }
        return num;
    }

    public static void main(String[] args) {
        Test_15_ExpectedListOfMatch sol = new Test_15_ExpectedListOfMatch();
//        int n = 8; int a = 4; int b = 7;
        int n = 8; int a = 1; int b = 4;
        System.out.println(sol.solution(n, a, b));
    }
}
