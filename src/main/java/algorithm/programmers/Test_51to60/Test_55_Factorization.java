package algorithm.programmers.Test_51to60;

import java.util.ArrayList;
import java.util.List;


public class Test_55_Factorization {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = 2; i < n + 1; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                answerList.add(i);
            }
        }
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_55_Factorization sol = new Test_55_Factorization();
        int n = 12;
        System.out.println(sol.solution(n));
    }
}
