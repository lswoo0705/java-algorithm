package programmers.programmers0.test_101to120;

public class Test_108_TailString {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();

        for (String s : str_list) {
            if (!s.contains(ex)) {
                answer.append(s);
            }
        }

        return answer.toString();
    }
}
