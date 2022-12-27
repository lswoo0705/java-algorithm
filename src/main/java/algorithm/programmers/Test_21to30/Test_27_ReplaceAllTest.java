package algorithm.programmers.Test_21to30;

public class Test_27_ReplaceAllTest {
    public void solution(String my_string) {
        String answer1 = my_string.replace("abc","왕");
        String answer2 = my_string.replaceAll("[abc]","왕");
        System.out.println(answer1);
        System.out.println(answer2);
    }

    public static void main(String[] args) {
        Test_27_ReplaceAllTest sol = new Test_27_ReplaceAllTest();
        String my_string = "aabbccddabc";
        sol.solution(my_string);
    }
}
