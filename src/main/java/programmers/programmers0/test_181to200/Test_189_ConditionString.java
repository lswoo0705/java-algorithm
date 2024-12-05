package programmers.programmers0.test_181to200;

public class Test_189_ConditionString {
    public int solution(String ineq, String eq, int n, int m) {
//        int answer = 0;
//
//        if (ineq.equals("<")) {
//            if (eq.equals("=")) {
//                if (n <= m) {
//                    answer = 1;
//                }
//            } else {
//                if (n < m) {
//                    answer = 1;
//                }
//            }
//        } else {
//            if (eq.equals("=")) {
//                if (n >= m) {
//                    answer = 1;
//                }
//            } else {
//                if (n > m) {
//                    answer = 1;
//                }
//            }
//        }
//
//        return answer;

        boolean result;

        if (ineq.equals("<")) {
            result = eq.equals("=") ? n <= m : n < m;
        } else {
            result = eq.equals("=") ? n >= m : n > m;
        }

        return result ? 1 : 0;
    }
}
