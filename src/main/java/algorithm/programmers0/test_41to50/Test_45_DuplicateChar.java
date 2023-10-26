package algorithm.programmers0.test_41to50;

public class Test_45_DuplicateChar {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.indexOf(my_string.charAt(i)) == i) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_45_DuplicateChar sol = new Test_45_DuplicateChar();
        String my_string = "people";
        System.out.println(sol.solution(my_string));
    }
}
