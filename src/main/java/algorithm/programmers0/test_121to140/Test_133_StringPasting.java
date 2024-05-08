package algorithm.programmers0.test_121to140;

// 부분 문자열 이어 붙여 문자열 만들기
public class Test_133_StringPasting {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            answer.append(my_strings[i], parts[i][0], parts[i][1] + 1);
        }

        return answer.toString();
    }
}
