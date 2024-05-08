package algorithm.programmers0.test_121to140;

// 글자 이어 붙여 문자열 만들기
public class Test_134_StringPasting2 {
    public String solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();

        for (int j : index_list) {
            answer.append(my_string.charAt(j));
        }

        return answer.toString();
    }
}
