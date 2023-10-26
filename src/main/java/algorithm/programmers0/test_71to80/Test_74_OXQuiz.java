package algorithm.programmers0.test_71to80;

public class Test_74_OXQuiz {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] list = quiz[i].split(" ");
            if (list[1].equals("+")) {
                if (Integer.parseInt(list[0]) + Integer.parseInt(list[2]) == Integer.parseInt(list[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (list[1].equals("-")) {
                if (Integer.parseInt(list[0]) - Integer.parseInt(list[2]) == Integer.parseInt(list[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_74_OXQuiz sol = new Test_74_OXQuiz();
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"}; // X, O
//        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}; // "O", "O", "X", "O"
        System.out.println(sol.solution(quiz));
    }
}
