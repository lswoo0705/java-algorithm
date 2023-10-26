package algorithm.programmers0.Test_01to20;

public class Test_16_RemoveChar {
    public String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter, "");
        return answer;
    }
}
