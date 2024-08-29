package programmers.programmers0.test_51to60;

public class Test_54_CtrlZ {
    public int solution(String s) {
        int answer = 0;
        String[] list = s.split(" ");
        for (int i = 0; i < list.length; i++) {
            if (!list[i].equals("Z")) {
                answer += Integer.parseInt(list[i]);
            } else if (list[i].equals("Z")){
                answer -= Integer.parseInt(list[i - 1]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_54_CtrlZ sol = new Test_54_CtrlZ();
        String s = "1 2 Z 3";
        System.out.println(sol.solution(s));
    }
}
