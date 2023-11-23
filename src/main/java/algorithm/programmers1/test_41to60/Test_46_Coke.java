package algorithm.programmers1.test_41to60;

import java.util.Arrays;

public class Test_46_Coke {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
//            answer += n / a * b;
//            int numOfCokeReceived = n / a * b;
//            int numOfCokeReduced = n / a * a;
//            n -= numOfCokeReduced;
//            n += numOfCokeReceived;

            int numOfCokeReceived = n / a * b;
            answer += numOfCokeReceived;
            n = n % a + numOfCokeReceived;
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_46_Coke sol = new Test_46_Coke();
//        int a = 2; int b = 1; int n = 20;
        int a = 3; int b = 1; int n = 20;
        System.out.println(sol.solution(a, b, n));
    }
}
