package algorithm.programmers0.test_51to60;

public class Test_59_CalculateString {
    public int solution(String my_string) {
        String[] arrMy_string = my_string.split(" ");
        int answer = Integer.parseInt(arrMy_string[0]);

        for (int i = 1; i < arrMy_string.length; i += 2) {
            if (arrMy_string[i].equals("+")) {
                answer += Integer.parseInt(arrMy_string[i + 1]);
            } else {
                answer -= Integer.parseInt(arrMy_string[i + 1]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_59_CalculateString sol = new Test_59_CalculateString();
        String my_string = "5 + 4 - 3";
        System.out.println(sol.solution(my_string));
    }
}
