package programmers.programmers0.test_51to60;

public class Test_51_AddHiddenNum {
    public int solution(String my_string) {
        int answer = 0;
        String[] my_numArr = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for (String my_num : my_numArr) {
            if (!my_num.equals("")) {
                answer += Integer.parseInt(my_num);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_51_AddHiddenNum sol = new Test_51_AddHiddenNum();
        String my_string = "aAb1B2cC34oOp";
        System.out.println(sol.solution(my_string));
    }
}
